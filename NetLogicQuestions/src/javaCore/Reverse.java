package javaCore;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5678;
		int result=0;
		int y=0;
		while(x!=0){
			y=x%10;
			result=result*10;
			result=result+y;
			
			x=x/10;		
		}
		System.out.println(result);

	}

}
