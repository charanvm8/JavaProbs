package javaConceptOfTheDay;

public class MImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=10;
		
		for(int i=0;i<n;i++)
		{
			MultiThread mul=new MultiThread();
			mul.start();
		}
		

	}

}
