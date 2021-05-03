package constructor;

 class Vehicle {
	
	   int wheels;
	   
	   Vehicle() {
	   }
	   
public class DemoConstructor {
	
	DemoConstructor() {
		System.out.println("object is now created");
	}
	
}
    public static void main (String []args) {
    	
    	Vehicle car = new Vehicle();
    	
    	System.out.println(car.wheels);

	}

}
