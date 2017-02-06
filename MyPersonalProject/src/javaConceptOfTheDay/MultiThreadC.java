package javaConceptOfTheDay;

public class MultiThreadC implements Runnable{
	public void run(){
	try{
		System.out.println("Thread : "+ Thread.currentThread().getId());
	}
	catch (Exception e){
		System.out.println("Exception catched");
	}
	
	}


}
