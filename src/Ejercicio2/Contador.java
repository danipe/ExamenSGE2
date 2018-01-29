package Ejercicio2;

public class Contador {
	
	private int contador;
	private boolean value;
	
	public Contador() {
		value = true;
		this.contador=10;
	}
	
	synchronized void aumentar(boolean b) {
		if(!value) {
			try {
				wait();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		value = b;
		contador++;
		notify();
	}
	
	synchronized void decrementar(boolean b) {
		if(value) {
			try {
				wait();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		value = b;
		contador--;
		notify();
	}
	
	synchronized void mostrar() {
		System.out.println("Contador: "+this.contador);
	}
	
	
}
