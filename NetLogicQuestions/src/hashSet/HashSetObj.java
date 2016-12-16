package hashSet;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> ne=new HashSet<String>();
		ne.add("charan");
		ne.add(null);
		ne.add("charan");
		ne.add(null);
		ne.add("vardhan");
		ne.add("mareedu");
		ne.add("harsha");		
		Iterator<String> itr=ne.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(9);
		hs.add(10);
		hs.add(8);
		hs.add(6);
		
		System.out.println(hs.size());
		System.out.println(hs.contains(6));
		System.out.println(hs.remove(8));
		
		Integer in=Collections.max(hs);
		Integer min=Collections.min(hs);
		System.out.println(in+min);
		
		Object[] objs=hs.toArray();
		for(Object o:objs)
			System.out.println(o);

	}

}
