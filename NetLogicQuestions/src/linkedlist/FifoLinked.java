package linkedlist;

import java.util.LinkedList;
import java.util.Queue;

public class FifoLinked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String> queue=new LinkedList<String>();	
		queue.offer("charan");
		queue.offer("vardhan");
		
		queue.add("mareedu");
		
		queue.poll();
		System.out.println(queue.peek());
		
		for(String ne:queue)
			System.out.println(ne);
		
		
	}

}
