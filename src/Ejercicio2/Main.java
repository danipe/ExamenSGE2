package Ejercicio2;

public class Main {

	/*
	 * Daniel Villaoslada Román
	 */
	
	public static void main(String[] args) {
		Contador c = new Contador();
		HiloA a = new HiloA(c);
		HiloB b = new HiloB(c);
		b.start();
		a.start();
	}
}
