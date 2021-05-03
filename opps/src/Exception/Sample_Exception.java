package Exception;

public class Sample_Exception {

	public static void main(String[] args) {
		
		
		//String str = null;
		//System.out.println(str.length());

		try {
			int a= 23,b=0;
			int c = a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("cant divided by zero");
		}
		try {
	
			int num = Integer.parseInt("Edureka");
			System.out.println(num);
		}
		catch(NumberFormatException e)
		{
			System.out.println("number format");
		}
		
		try {
			int a[] = new int[5];
			a[7]=8;
		}
		catch(ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("array index out of bound");
		}
	}

}
