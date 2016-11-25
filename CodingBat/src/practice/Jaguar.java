package practice;

public class Jaguar extends Car{
	void speed(){
		System.out.println("400km/hr");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jaguar g=new Jaguar();
		g.speed();
		Car k=g;
		k.speed();
		

	}

}
