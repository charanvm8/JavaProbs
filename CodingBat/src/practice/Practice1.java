package practice;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a=0;
		long b=1;
		long sum=0;
		long total=0l;
		
		for(long i=1;i<=4000000l;i++){
			sum=a+b;
			
			if(sum%2==0)
				total+=1;
			a=b;
			b=sum;
			
		}
		System.out.println(total);
	}

}
