package first25;

public class Q1 {
	public int multiples(int num){
		int sum=0;
		for(int i=1;i<num;i++){
			if(i%3==0 || i%5==0){
				sum+=i;
			}
			
		}
	
		return sum;
	}
public static void main(String[] args){
	Q1 ne=new Q1();
	int result=ne.multiples(1000);
	System.out.println(result);
	
}

}
