package netLogic;

public class First5 {

	public static void main(String[] args) {
		// 1 basic arthmetic operations 
		
		
		System.out.println("Addition " + (20+50));
		
		
		// num is odd or even
		int q=9;
		if(q%2==0){
			System.out.println("even");
		}
		else{
			System.out.println("odd");
		}
		
		
		// without swapping
		
		int a=40;
		int b=30;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a+" "+b);
		
		// divide without using / *
		
		int c=2;
		
		System.out.println(c<<1);
		System.out.println(c>>1);
		
		// circumference and area
		
		double r=4;
		
		System.out.println(Math.PI*(r*r));
		System.out.println(2*Math.PI*r);
		
		
		
		
		
		
	}

}
