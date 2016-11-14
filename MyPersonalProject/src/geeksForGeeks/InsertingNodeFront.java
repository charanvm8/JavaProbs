package geeksForGeeks;

public class InsertingNodeFront {

	Node head;
	
	public void front(int d){
		Node fro=new Node(d);
		fro.next=head;
		fro=head;
		
	}
}
