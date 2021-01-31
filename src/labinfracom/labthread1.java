package labinfracom;




public class labthread1 extends Thread{
	


	
	
	
	public void run () {
		System.out.println("Extendiendo la clase Thread");
	}
	
	public static void main (String [] args) {
		labthread1 t = new labthread1();
		
		t.start();
	}

	
	
	
	
	
}


