package Encapsulation;

public class Student {
	
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		
		if(age > 20) {
			System.out.println("not eligible to be a student");
		}else {
			this.age = age;
		}
	}
	
}