package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListsJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ne=new ArrayList<Integer>();
		ne.add(10);
		ne.add(20);
		
		ArrayList<Integer> ne1=new ArrayList<Integer>();
		ne1.add(30);
		ne1.add(40);
		ne.addAll(ne1);
		
		Iterator<Integer> itr=ne.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
		
		ne.addAll(1, ne1);
		System.out.println("new");
		Iterator<Integer> itr1=ne.iterator();
		
		while(itr1.hasNext())
			System.out.println(itr1.next());
		
		
		
	}

}
