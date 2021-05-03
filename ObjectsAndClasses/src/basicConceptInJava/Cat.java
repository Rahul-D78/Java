package basicConceptInJava;

public class Cat {
	boolean hasfur;
	String color;
	int legs,eyes;
	
	public void walk() {
		System.out.println("cat is walking");
		
	}
	public void eat() {
		System.out.println("cat is eating");
	}
	
	public class MainClass {
		public  void main(String []args) {
			
			Cat cat1 = new Cat();
			Cat cat2 = new Cat();
			
			cat1.walk();
			cat2.eat();
			
		}
	}

}
