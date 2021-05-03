package opps;

public class Student {
	
	static String name = "abc";
	int age;
	String grade = "first";
	
	public void display() {
		System.out.println("student "+ name + "is " + age + "years old" + grade + "grade");
	}
	public static void doThis() {
		System.out.println("execute this");
	}
		
}
