package Exception;

public class NestedCatch {

	public static void main(String[] args) {
    
		try {
			int a[] = new int[5];
		
		a[7] = 13;
		System.out.println(a.length);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("can not be accessed");
		}
		
		catch(Exception e) {
			System.out.println("sucessfully handeled");
		}
		finally {
			System.out.println("this block ids always executed");
		}
	}

}
