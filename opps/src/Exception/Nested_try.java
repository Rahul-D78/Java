package Exception;

public class Nested_try {

	public static void main(String[] args) {
		
		try {
			try {
		   int num = Integer.parseInt("edurika");
		   System.out.println(num);
		   }
		catch(NumberFormatException e)
		{
			System.out.println("number format");
		}
		
		try {
			int a[] = new int [5];
			a[6] = 9;
		}
		catch(Exception e) 
		{
			System.out.println("Handeled");
		}
		System.out.println("other statements");
		}
		catch(Exception e)
		{
			System.out.println("handeled and recoverd");
		}
	}

}
