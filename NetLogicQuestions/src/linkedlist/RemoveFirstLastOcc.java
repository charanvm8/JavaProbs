package linkedlist;

import java.util.LinkedList;

public class RemoveFirstLastOcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> integer=new LinkedList<Integer>();
		integer.add(10);
		integer.add(20);
		integer.add(10);
		integer.add(20);
		integer.add(10);
		integer.add(20);
		
		integer.removeFirstOccurrence(10);
		integer.removeLastOccurrence(10);
		
		for(Integer i:integer)
			System.out.println(i);
	}

}
