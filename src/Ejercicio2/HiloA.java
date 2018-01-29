package Ejercicio2;

public class HiloA extends Thread {
	Contador c;
	public HiloA(Contador c) {
		this.c = c;
	}
	
	@Override
	public void run() {
		synchronized (c) {
			for(int i = 0; i<10; i++) {
				c.decrementar(i<9 ? false : true);
				c.mostrar();
//				try {
//					sleep(1000);
//				} catch (Exception e) {
//					// TODO: handle exception
//				}
			}
		}
		// TODO Auto-generated method stub
		super.run();
	}
}
