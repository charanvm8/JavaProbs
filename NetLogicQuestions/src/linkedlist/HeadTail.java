package linkedlist;

import java.util.LinkedList;

public class HeadTail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list=new LinkedList<Integer>();
		
		list.add(10);
		list.offer(20);
		list.offerFirst(30);
		list.addFirst(40);
		list.add(50);
		list.offerLast(60);
		list.addLast(70);
		System.out.println(list.peek());
		
		list.add(2, 100);
		list.removeLast();
		list.poll();
		list.pollLast();
		list.set(2, 200);
		System.out.println("peek"+ list.peek());
		for(Integer n:list)
			System.out.println(n);
	}

}
