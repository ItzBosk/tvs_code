
public class CicliArray {

	//@ requires budget != null;
	//@ ensures (\forall int i; i>= 0&& i< budget.length; budget[i] ==5);
	//@ diverges true;
	void scommesse(int[] budget){
		//@ loop_invariant i <= budget.length && (\forall int j; j>= 0 && j<i; budget[j] ==5);
		for(int i = 0; i < budget.length; i++){
			budget[i] = 5;
		}
	}
	
}
