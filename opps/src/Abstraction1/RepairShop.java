package Abstraction1;
 
public class RepairShop {
	
	public static void repairCar(Car car) {
		System.out.println("car has been repaired");
	}
	

	
    public static void main(String []args) {
    	
        Car car;
        car = new Wagnor();
        car.Accelerating();
    	
        Wagnor wagnor = new Wagnor();
        
       Audi audi = new Audi();
    	
    //	Car car = new Car();  // abstract classes can not be overRidden
    	
    	
    	repairCar(wagnor);
    	repairCar(audi);
    	
    	
    }

}
