package practice;

public class WarmUp1 {
	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		  if(aSmile==true && bSmile==true ){
		    return true;
		  }
		  else if(aSmile==false && bSmile==false){
		    return true;
		  }
		  else{
		    return false;
		  }
		}
	public int sumDouble(int a, int b) {
		  if(a==b){
		    return 2*(a+b);
		  }
		  else{
		    return a+b;
		  }
		}
	public int diff21(int n) {
		  if(n<=21){
		    return 21-n;
		  }
		  else{
		    return 2*(n-21);
		  }
		}
	public boolean parrotTrouble(boolean talking, int hour) {
		  if(talking==true && hour<=6){
		    return true;
		  }
		  else if(talking==true && hour>=21){
		    return true;
		  }
		  else{
		    return false;
		  }
		}
	public boolean makes10(int a, int b) {
		  if(a==10 || b==10 ||(a+b)==10){
		 return true;   
		}
		else{
		  return false;
		}
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
