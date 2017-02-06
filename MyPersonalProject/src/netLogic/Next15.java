package netLogic;

import java.util.HashSet;

public class Next15 {
	
	
	
	public static void main(String[] args){
		
		//leap year or not
		
		int num=2000;
		if(num%4==0){
			System.out.println("it a leap year");
			
		}
		
		// consecutive odd and even avg
		
		// display triangle
		
		//reverse a number
		
		int x=987;
		
		int revNum=0;
		
		while(x>1){
			int temp=x%10;
			revNum=revNum*10+temp;
			x=x/10;
			
		}
		System.out.println(revNum==x);
		
		
		
		
	}

}
