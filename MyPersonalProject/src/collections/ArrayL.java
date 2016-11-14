package collections;

import java.util.ArrayList;

public class ArrayL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ne=new ArrayList<String>();
		System.out.println(ne.isEmpty());
		ne.add("charan");
		ne.add("vardhan");
		ne.add("mareedu");
		for(String i:ne){
			
			System.out.println(i);
		}
		System.out.println(ne.size());
		System.out.println(ne.isEmpty());
		System.out.println(ne.remove(1));
for(String i:ne){
			
			System.out.println(i);
		}
		System.out.println(ne.contains("charan"));
		System.out.println(ne.toArray());
		

	}

}
