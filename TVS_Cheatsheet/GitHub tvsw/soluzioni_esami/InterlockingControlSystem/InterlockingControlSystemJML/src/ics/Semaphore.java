package ics;

//semaforo rosso,verde,giallo
enum Semaphore {
	RED,GREEN,YELLOW;
	public String toString() {
		return name().substring(0,1);
	};
}