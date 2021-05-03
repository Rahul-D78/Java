package Abstraction;

public class Main {

	public static void main(String[] args) {
		
		Mobile m;
		
		m = new Ios();
		m.doubleTap();
		
		m = new Android();
		m.doubleTap();

	}

}
