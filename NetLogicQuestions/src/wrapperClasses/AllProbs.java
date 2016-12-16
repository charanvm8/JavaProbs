package wrapperClasses;

public class AllProbs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer integer=new Integer(10);
		int s=(integer.intValue());
		System.out.println(s);
		double k=integer.doubleValue();
		byte b=integer.byteValue();
		short p=integer.shortValue();
		float f=integer.floatValue();
		long l=integer.longValue();
		System.out.println(k+" "+ b+" " + p+" " + f +" "+ l);
		
		Integer[] ne=new Integer[3];
		
		ne[0]=30;
		ne[1]=10;
		ne[2]=20;
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(ne);
		
		String str="23456";
		
		int int1=Integer.parseInt(str);
		System.out.println(int1);
		
		int int2=Integer.parseInt(str, 27);
		System.out.println(int2);
		
		Boolean b1=new Boolean(false);
		System.out.println(!b1);
		
		String str1="charan";
		Boolean b2=new Boolean(str1);
		System.out.println(b2);
		
				
		
		
		//Question 8 Should be done again
		
		
		
		
		
		

	}

}
