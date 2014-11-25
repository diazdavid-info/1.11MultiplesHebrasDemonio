package david;

class MiHebra extends Thread{
	public void run(){
		while(true);
	}
}

public class MultiplesHebrasDemonio {

	public static void main(String[] args) {
		MiHebra mh = new MiHebra();
		mh.setDaemon(true);
		System.out.println("La hebra es un demonio? "+mh.isDaemon());
		mh.start();
		
		//while(true);

	}

}
