package arrayList;

import java.util.ArrayList;

public class ArrayList2Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ne=new ArrayList<String>();
		ne.add("charan");
		ne.add("vardhan");
		System.out.println(ne.get(1));
		ne.set(1,"mareedu");
		ne.add("vardhan");
		ne.add(1, "vardhan");
		ne.remove(1);
		
		String[] copy=new String[ne.size()];
		ne.toArray(copy);
		for(String n:copy)
			System.out.println(n);
		
		ne.clear();
		System.out.println(ne.size());
	}

}
