package modeljunit;

import nz.ac.waikato.modeljunit.Action;
import nz.ac.waikato.modeljunit.FsmModel;
import modeljunit.Zoo;

public class ZooFSM implements FsmModel {

    enum ZooState {
        ALL_HEALTHY, // Tutti gli animali sono sani
        ANY_SICK, // Almeno un animale è malato
        MEDICINE_DEPLETED, // Le scorte di medicine sono esaurite
        TIME_ADVANCED // Il tempo è avanzato, influenzando le condizioni degli animali
    };

    private ZooState state = ZooState.ALL_HEALTHY;
    private Zoo zoo = new Zoo();

    public ZooState getState() {
        return state;
    }

    public void reset(boolean testing) {
        zoo = new Zoo();
        state = ZooState.ALL_HEALTHY;
    }

    @Action
    public void manageAnimali() {
        zoo.manageAnimali();
        updateStateAfterManageAnimali();
    }

    @Action
    public void malato() {
        int animaleIndex = new java.util.Random().nextInt(3); // Sceglie un animale a caso
        if (zoo.medicine > 0 && zoo.statoAnimale[animaleIndex] != 1) {
            zoo.malato(animaleIndex);
            updateStateAfterMalato();
        }
    }

    private void updateStateAfterManageAnimali() {
        // Aggiorna lo stato basato sull'effetto dell'azione manageAnimali
        if (java.util.Arrays.stream(zoo.statoAnimale).anyMatch(s -> s == 1)) {
            state = ZooState.ANY_SICK;
        } else if (zoo.medicine == 0) {
            state = ZooState.MEDICINE_DEPLETED;
        } else {
            state = ZooState.ALL_HEALTHY;
        }
    }

    private void updateStateAfterMalato() {
        // Aggiorna lo stato dopo aver eseguito l'azione malato
        if (java.util.Arrays.stream(zoo.statoAnimale).allMatch(s -> s == 0)) {
            state = ZooState.ALL_HEALTHY;
        } else {
            state = ZooState.ANY_SICK;
        }

        if (zoo.medicine == 0) {
            state = ZooState.MEDICINE_DEPLETED;
        }
    }

    @Action
    public void advanceTime() {
        // Simula il passaggio del tempo modificando il campo `time` e aggiornando lo stato degli animali
        zoo.time = (zoo.time + 1) % 4; // Assume che il tempo vada da 0 a 3
        zoo.manageAnimali(); // Utilizza manageAnimali per applicare le modifiche basate sul tempo
        updateStateBasedOnTime();
    }

    private void updateStateBasedOnTime() {
        // Controlla le condizioni degli animali e le scorte di medicine dopo l'avanzamento del tempo
        boolean anySick = java.util.Arrays.stream(zoo.statoAnimale).anyMatch(s -> s == 1);
        boolean anyHungry = java.util.Arrays.stream(zoo.statoAnimale).anyMatch(s -> s == 2);
        
        if (zoo.medicine == 0) {
            state = ZooState.MEDICINE_DEPLETED;
        } else if (anySick) {
            state = ZooState.ANY_SICK;
        } else if (anyHungry) {
            state = ZooState.TIME_ADVANCED; // Indica che ci sono animali affamati a causa dell'avanzamento del tempo
        } else {
            state = ZooState.ALL_HEALTHY;
        }
    }

}
