package javaCore;

public class SwapNumbers {

	public static void main(String[] args) {
		// Write a program to swap two numbers without using temporary variable?
		int x=10;
		int y=20;
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("x : " +x+ " y : " + y);
		
		

	}

}
