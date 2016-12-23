package geeksForGeeks;

public class BinarySearch {

	
	public int bin_ser(int[] arr,int l,int k,int x){
		int mid=(l+k)/2;
		if(arr[mid]==x){
			return mid;
		}
		if(arr[mid]>x){
			return bin_ser(arr,l,mid-1,x);
		}
		return bin_ser(arr,mid+1,k,x);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearch ne=new BinarySearch();
		int[] arr={10,20,30,40,50,60};
		int k=arr.length;
		int x=60;
		int y=ne.bin_ser(arr, 0, k, x);
		System.out.println(y);
		
		

	}

}
