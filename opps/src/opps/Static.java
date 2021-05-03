package opps;

import opps.A.B;
import opps.A.C;

public class Static {
	static {
		System.out.println("in bloc 1");
	}
	
	static {
		System.out.println("fghdhg");
	}
   
	public static void main(String []args) {
    
		A objA = new A();
		B objB = objA.new B();
		C objc = new A.C();
	}
		 static {		
			System.out.println("nhskkasn");
		
}
}