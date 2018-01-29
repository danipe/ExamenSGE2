package Ejercicio1;

public class Hilo extends Thread{
	
	String msg;
	public Hilo(String msg) {
		this.msg = msg;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i<5; i++) {
			System.out.println(msg);
//			try {
//				sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
		System.out.println("Finaliza el hilo :"+msg);
		super.run();
	}
}
