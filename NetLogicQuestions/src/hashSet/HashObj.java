package hashSet;

import java.util.HashSet;
import java.util.Set;

public class HashObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Price> ne=new HashSet<Price>();
		
		Price baPrice=new Price("bananas", 20);
		
		ne.add(new Price("Apples", 60));
		ne.add(baPrice);
		
		ne.remove(baPrice);
		
		for(Price p:ne){
			System.out.println(p);
		}
		
		
		

	}

}
