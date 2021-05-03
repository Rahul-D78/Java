package opps;

public class Method {

	public static void main(String[] args) {
		
		int firstNum = 23;
		int secondNum = 12;
		int result = maxOf(firstNum,secondNum);
		    System.out.println(result);
		    
	}	
	    

	static int maxOf(int a, int b) {
		if(a > b) {
		  return a;
		}else {
			return b;
		}
		 
		
		  
	}

}

