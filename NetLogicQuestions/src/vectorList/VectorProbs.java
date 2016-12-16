package vectorList;

import java.util.Enumeration;
import java.util.Vector;

public class VectorProbs {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Vector<String> ne=new Vector<String>();
		ne.add("charan");
		ne.add("vardhan");
		ne.add("mareedu");
		System.out.println(ne.get(2));
		System.out.println(ne.indexOf("charan"));
		System.out.println(ne.firstElement());
		System.out.println(ne.lastElement());
		
		Vector<String> ne2=(Vector<String>) ne.clone();
		System.out.println(ne2.subList(1, 3));		
		
		Enumeration<String> enu=ne.elements();
		
		while(enu.hasMoreElements())
			System.out.println(enu.nextElement());
		
		String[] str=new String[ne.size()];
		ne.copyInto(str);
		System.out.println(str.length);
	}

}
