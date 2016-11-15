package first25;

public class Q2 {
	
	public int fibanocci(int range){
		int first=0;
		int second=1;
		int ref=1;
		int total=0;
		
		for(int i=1;i<=range;i++){
			ref=first+second;
			second=ref;
			first=second;
			
		}
		if(ref%2==0){
			total+=ref;
		}
		return total;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q2 ne=new Q2();
		int results=ne.fibanocci(1000);
		System.out.println(results);
		

	}

}
