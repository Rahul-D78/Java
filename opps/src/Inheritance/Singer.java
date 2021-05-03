package Inheritance;

public class Singer extends Person {
	
	public Singer(String name) {
		super(name);
		System.out.println("inside singer");
	}
	
	public void sing() {
		System.out.println(name + " singer is singing");
	}
	public void eat() {
		System.out.println("singer" + name + " is eating");
	}

}
