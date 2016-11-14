package sorting;

public class LinearSearch {
	
	 int linear(int[] a,int x, int z){
		for(int i=0;i<x;i++){
			if(z==a[i]){
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args){
		LinearSearch ch=new LinearSearch();
		
		int[] a={10,20,30,50,80,100};
		
		int result=ch.linear(a, 6, 80);
		System.out.println(result);
		
	}

}

