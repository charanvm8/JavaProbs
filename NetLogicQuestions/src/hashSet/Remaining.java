package hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Remaining {

	public static void main(String[] args) {
		// Remaining problem in the assignment
		HashSet<Integer> hash=new HashSet<Integer>();
		hash.add(10);
		hash.add(20);
		hash.add(20);
		
		HashSet<Integer> hashTwo=new HashSet<Integer>();
		hashTwo.add(10);
		hashTwo.add(20);
		hashTwo.add(20);
		hashTwo.add(40);
		
		
		
		hash.retainAll(hashTwo);
		System.out.println(hash.size());
		
		Iterator<Integer> itr=hash.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
		
		Iterator<Integer> itr2=hashTwo.iterator();
		
		while(itr2.hasNext())
			System.out.println(itr2.next());
		
		
		Integer[] integer=new Integer[hashTwo.size()];
		hashTwo.toArray(integer);
		
		
		

	}

}
