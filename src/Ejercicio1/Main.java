package Ejercicio1;

public class Main {
	
	/*
	 * Daniel Villaoslada Román
	 */
	
	public static void main(String[] args) {
		Hilo hilo1 = new Hilo("Soy Batman, el mejor!!");
		Hilo hilo2 = new Hilo("Soy Spiderman, el yogurín del grupo");
		Hilo hilo3 = new Hilo("Para superhéroe yo, Ironman");
		hilo1.setPriority(10);
		hilo2.setPriority(1);
		hilo3.setPriority(2);
		hilo1.start();
		hilo2.start();
		hilo3.start();
		try {
			hilo1.join();
			hilo2.join();
			hilo3.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("el hilo principal terminado");

	}

}
