package geeksForGeeks;

public class InsertingNodeMiddle {
	
	
	public void middleInsert(Node prev,int d){
		if(prev==null){
			System.out.println("Entered previous node is not present");
			return;
		}
		Node ne=new Node(d);
		ne.next=prev.next;
		prev.next=ne;
		
		
		
		
	}

}
