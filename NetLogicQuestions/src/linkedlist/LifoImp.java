package linkedlist;

import java.util.LinkedList;

public class LifoImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> in=new LinkedList<Integer>();
		in.push(10);
		in.push(20);
		in.push(30);
		in.push(10);
		in.push(20);
		in.push(30);
		in.push(10);
		in.push(20);
		in.push(30);		
		
		@SuppressWarnings("unchecked")
		LinkedList<Integer> clone = (LinkedList<Integer>) in.clone();
		LinkedList<Integer> clone2=clone;
		System.out.println(clone2.size());
		in.pop();		
		
		System.out.println(clone2.lastIndexOf(30));
		in.clear();
		for(Integer i:in)
			System.out.println(i);
		
	}

}
