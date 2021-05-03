package list;

import java.util.ArrayList;
import java.util.List;

public class myArrayList {

	public static void main(String[] args) {
		
		//generics defines what type of function it is .
		 
		List<String> fruits = new ArrayList();
		
	    fruits.add("apple");
	    fruits.add("Orange");
	    fruits.add("Bananna");
	
	
	    List<String> Vegetables = new ArrayList();
	    
	    Vegetables.add("Pepsicum");
	    Vegetables.add("oninon");
	    Vegetables.add("carrot");
	    

	//its a importtant method of arraylist
	    
	    String temp[] = new String [fruits.size()];
	    
	    fruits.toArray(temp);
	    
	    for(String e: temp) {
	    	System.out.println(e);
	    }
	
	}
}
	    		
	   
	    		
	    		
	    
