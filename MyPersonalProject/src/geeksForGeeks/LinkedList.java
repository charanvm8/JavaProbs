package geeksForGeeks;

public class LinkedList {
	Node head;
	
	static class Node{
		int d;
		Node next;
		
		Node(int d){
			this.d=d;
			next=null;
			
		}
	}
		
		public static void main(String[] args){
			
		LinkedList ne=new LinkedList();
		ne.head=new Node(10);
		ne.head.next=new Node(20);
		ne.head.next.next=new Node(30);
		
		
		
		
		
		
	}
	

}
