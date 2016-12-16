package javaCore;

public class OddEven {
	
	public void OddEven2(int x){
		if(x%2==0){
			System.out.println("Its a even number");
		}
		else{
			System.out.println("Its a odd number");
		}
	}

	public static void main(String[] args) {
		// Write a Java program to find whether given number is Even or Odd
		OddEven ne=new OddEven();
		ne.OddEven2(25);
	}

}
