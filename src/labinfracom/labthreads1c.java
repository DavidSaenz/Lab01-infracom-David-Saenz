package labinfracom;

public class labthreads1c extends Thread{
	
	
	
	
	private final static int MAX = 3;
	
	private String name;
	
	
	public labthreads1c(String Name){
	System.out.println("extendiedno la calse Thread");
	this.name= name;
	}

	public void run () {
		System.out.println("el nombre es "+ name);
	}
	
	public static void main (String[]args) {
		
	labthreads1c [] ta= new labthreads1c [MAX];
	
	for (int i = 0; i < ta.length; i++) {
		
		ta[i] = new labthreads1c ("Thread" + i);
	}
		
	for (int i = 0; i < ta.length; i++) {
		ta[i].start();
	}
	}
	
	
	
}
