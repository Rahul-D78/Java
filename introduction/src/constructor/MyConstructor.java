package constructor;

 class Vehicle {
	
     
	 int wheels;
	
	Vehicle(int noOfWheels) {
		wheels = noOfWheels;
	}
	
 }
 	

 class MyConstructor {

	MyConstructor() {
	}	
	public static void main(String[] args) {

		
		Vehicle scooty = new Vehicle(2);
		
		System.out.println(scooty.wheels);
	}

	}


 

 