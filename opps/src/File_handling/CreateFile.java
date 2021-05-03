package File_handling;

import java.io.File; //import the file class
import java.io.IOException; //import the ioexception class to handle errors

public class CreateFile {

	public static void main(String[] args) {
		
    try {
    	File myobj = new File("F://java//filef1.txt");
    	if(myobj.createNewFile()) {
    		System.out.println("file created" + myobj.getName());
    	}else {
    		System.out.println("filoe not created");
    	}
    }
    	catch(IOException e) {
    		System.out.println("successfully handeled");
    		
    	}
		}

	}


