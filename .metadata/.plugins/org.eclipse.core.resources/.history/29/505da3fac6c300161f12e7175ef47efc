package hashSet;

public class Price {
	private String name;
	private  int price;
	
	public Price(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public int hashCode(){
		System.out.println("In HashCode method");
		int hashcode=0;
		hashcode=price*20;
		hashcode+=name.hashCode();
		return hashcode;
		
	}
	
	public boolean equals(Object obj){
		if(obj instanceof Price){
			Price pp=(Price) obj;
			return (pp.name.equals(this.name) && pp.price==this.price);
		}
		else{
			return false;
		}
		
		
	}
	
	public String toString(){
		return "ITEM : "+getName()+" PRICE : "+getPrice();
	}
	

}
