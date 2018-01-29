package Ejercicio2;

public class HiloB extends Thread {
	Contador c;
	public HiloB(Contador c) {
		this.c = c;
	}
	
	@Override
	public void run() {
		synchronized (c) {
			for(int i = 0; i<10; i++) {
				c.aumentar(i<9 ? true : false);
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
