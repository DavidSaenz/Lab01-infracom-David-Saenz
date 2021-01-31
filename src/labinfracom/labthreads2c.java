package labinfracom;

public class labthreads2c implements Runnable{
	
	
	private final static int MAX = 3;
	
	private String name;
	
	
	public labthreads2c(String Name){
	System.out.println("implementando runnable");
	this.name= name;
	}

	public void run () {
		System.out.println("el nombre es "+ name);
	}
	
	public static void main (String[]args) {
		
	Thread [] ta= new Thread [MAX];
	
	for (int i = 0; i < ta.length; i++) {
		
		ta[i] = new Thread (new labthreads2c ("Thread" + i));
	}
		
	for (int i = 0; i < ta.length; i++) {
		ta[i].start();
	}
	}
	
	
	

}
