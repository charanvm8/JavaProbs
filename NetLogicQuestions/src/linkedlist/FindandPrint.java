package linkedlist;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class FindandPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ne=new LinkedList<Integer>();
		ne.add(10);
		ne.add(20);
		ne.add(30);
		
		boolean b=ne.contains(20);
		if(b)
			System.out.println(ne.indexOf(20));
		
		Iterator<Integer> itr=ne.descendingIterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		ArrayList<Integer> ne1=new ArrayList<Integer>();
		ne1.add(40);
		ne1.add(50);
		
		ne.addAll(ne1);
		ne.remove();
		
		Iterator<Integer> itr1=ne.iterator();
		
		while(itr1.hasNext())
			System.out.println(itr1.next());

	}

}
