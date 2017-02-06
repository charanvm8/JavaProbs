package netLogic;

public class Strings5 {
	
	
	
	public String revRes(String y)
	{
		if(y.length()==0){
			return "";
		}
		
		return y.charAt(y.length()-1)+revRes(y.substring(0, y.length()-1));
	
	}
	
	public int factorial(int z){
		if(z==1){
			return 1;
		}
		return z*factorial(z-1);
		
	}

	
	
	public String reverse(String x)
	{
		String str=x;
		String revStr="";
		char[] chars=str.toCharArray();
		for(int i=chars.length-1;i>=0;i--){
			revStr+=chars[i];
		}
		return revStr;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Strings5 str=new Strings5();
		String k="aba";
		String revStr=str.revRes(k);
		System.out.println(k.equals(revStr));
		
		String num="100";
		int number=Integer.parseInt(num);
		System.out.println(number);
		double numbe=Double.parseDouble(num);
		System.out.println(numbe);
		
		// random 5
		int i=0;
		while(i<5){
			System.out.println(Math.round(Math.random()*100));
			i++;
		}
		
		int x=6;
		int y=7;
		System.out.println(Math.max(x, y));
		
		double nu=2;
		double power=6;
		System.out.println(Math.pow(nu, power));
		System.out.println(str.factorial(10));
		
	}

}
