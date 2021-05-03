package Inheritance;

public class Teacher extends Person {
	
	  Teacher(String name) {
		  super(name);
		  System.out.println("inside the constructor");
		 
	 }
	public void tech() {
		 System.out.println(name + " is teaching");
	}
	public void eat() {
		super.eat();
		System.out.println("techer " + name + " is eating");
	}

}
