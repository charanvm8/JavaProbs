package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayConst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ne=new ArrayList<Integer>();
		ne.add(5);
		//ArrayList<Integer> ne1=new ArrayList<Integer>(10);
		ArrayList<Integer> ne2=new ArrayList<Integer>(ne);
		
		
		
		Iterator<Integer> itr=ne2.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		
		
	}

}
