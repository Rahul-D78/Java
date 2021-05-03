package MethodOverriding;

public class Main {

	public static void main(String[] args) {
		
		Animal a;
		
		a = new Animal();
		a.whoAmI();
		
		a = new Dog();
		a.whoAmI();
		
		a = new Cat();
		a.whoAmI();
		//the same method with exact same arguments then the child and subclass when we creat an object and call it
		//then child overrides parent
		//same method common between parent and a child
		//sub class overrides child class.......
        //..........polymorphism....
	}

}
