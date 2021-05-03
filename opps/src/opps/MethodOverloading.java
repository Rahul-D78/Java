package opps;

public class MethodOverloading {
//	................differ in num of and type of arguments...................... 
	
	public void add(int a, int b) {
		System.out.println(a + b);
		}
	public void add(double a, double b) {
		System.out.println(a - b);
	}
	
	public void add(int a, int b, int c) {
		System.out.println(a + b);
	}
}
