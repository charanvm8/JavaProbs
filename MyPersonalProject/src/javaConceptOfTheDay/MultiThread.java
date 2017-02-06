package javaConceptOfTheDay;

public class MultiThread extends Thread{
	
	public void run(){
		
		try{
			System.out.println("Thread : "+ Thread.currentThread().getId());
		}
		catch (Exception e){
			System.out.println("Exception catched");
		}
		
	}

	
}
