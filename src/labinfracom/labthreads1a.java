package labinfracom;



public class labthreads1a extends Thread{

	private int n;
	
	public labthreads1a(int n) {
	System.out.println("Extendiendo clase thread");
	this.n = n;
	
	}
	
	
	
	public void run () {
		System.out.println ("El valor inicial es :" +n);
	}
	
	
	public static void main( String [] args){
		labthreads1a t = new labthreads1a(5);
		
		t.start();
	}
	
}
