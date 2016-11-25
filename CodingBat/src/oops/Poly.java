package oops;



public class Poly implements Runnable{
	@Override
	public void run(){
		for(int i=0;i<20;i++){
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Poly ne=new Poly();
		Thread t=new Thread(ne);
		t.start();

	}

}
