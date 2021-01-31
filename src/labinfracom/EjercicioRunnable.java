package labinfracom;

import java.util.Scanner;

public class EjercicioRunnable implements Runnable{


	private static int valorMax =10; //10 por defecto para realizar  pruebas, se modifica en el main
	private int  inicial=1; //inicia en 1 para evitar ambiguedad en el 0
	private String name;
	boolean esPar;

	//	public EjercicioRunnable(String name) {
	//		System.out.println("Implementando runnable");
	//		this.name = name;
	//	}


	public void run () {
		try {

		}
		catch (Exception e) {}

		System.out.println ("Saliendo: " + name);
	}

	public static void main (String[] args) {

		//almacenar el inputt de la consola en variable n
		Scanner reader = new Scanner(System.in); 
		System.out.println("ingrese el valor maximo: ");
		int n = reader.nextInt(); 
		reader.close();
		System.out.println("El valor ingresado es:  " + n);

		valorMax=n;

		//el constructor del "ejercicioRunnable"  se integro al main para facilitar implementacion"
		EjercicioRunnable er = new EjercicioRunnable();
		er.esPar=true;

		Thread t0 = new Thread (new EjercicioRunnable() {
			public void run(){
				er.imprPar();
			}
		});
		Thread t1 = new Thread (new EjercicioRunnable() {
			public void run(){
				er.imprImpar();
			}
		});
		t0.start();
		t1.start();

	}


	public void imprImpar() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		synchronized (this) {
			while(inicial < valorMax) { 
				while (!esPar) {	//IMPAR, no es par
					try {

						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("thread impar :" + inicial);
				inicial++;
				esPar = false;
				notify();
			}

		}
	}

	public void imprPar() {

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		synchronized (this) {
			while (inicial < valorMax) {
				while (esPar) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("thread par :" + inicial);
				inicial++;
				esPar = true;
				notify();
			}
		}

	}

}
