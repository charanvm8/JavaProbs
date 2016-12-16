package linkedlist;

import java.util.LinkedList;

public class Retrieval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list=new LinkedList<Integer>();
		
		list.add(10);
		list.offer(20);
		list.offerFirst(30);
		list.addFirst(40);
		list.add(50);
		
		System.out.println(list.peekLast());
		System.out.println(list.peek());
		System.out.println(list.element());
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		

	}

}
