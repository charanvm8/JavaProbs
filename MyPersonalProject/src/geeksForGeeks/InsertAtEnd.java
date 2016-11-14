package geeksForGeeks;

public class InsertAtEnd {
Node head;
	
	public void insertEnd(int d){
		
		Node ne =new Node(d);
		
		if(head==null){
			head=ne;
			return;
		}
		ne.next=null;
		
		Node last=head;
		while(last.next!=null){
			last=last.next;
			
		}
		last.next=ne;
		return;
		
		
		
	}
}
