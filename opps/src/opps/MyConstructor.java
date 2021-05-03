package opps;

 class Vehicle {
	 int wheels;
	private String color;
	 
	 
	 Vehicle(int wheels) {
		this.wheels = wheels;
		 
	}
	 Vehicle(int wheels, String color) {
		 this.wheels = wheels;
		 this.color = color;
	 }
 
 

	public static void main(String []args) {
    
		Vehicle car = new Vehicle(5);
		Vehicle scooty = new Vehicle(6, "pink");
		
		System.out.println(scooty.wheels + scooty.color);
		System.out.println(car.wheels);
	}

}
