package Exception;

public class Throw {

       static void  avg() throws ArithmeticException {

    	   System.out.println("inside Avg function");
    	   
    	   throw new ArithmeticException("Demo");
       }
       
       public static void main(String []args) {
    	   
    	   try {
    		   avg();
    	   }catch(ArithmeticException e) {
    		   System.out.println("Succesfully caught");
    	   }
    	   finally {
    		   System.out.println("Final block got executed");
    	   }
       }
       
}
				
	
		    

	


