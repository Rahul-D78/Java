package File_handling;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadFromFile {

	public static void main(String[] args) {
    try {
    	File myObj = new File("F:\\Java\\filef1.txt");
    	Scanner myread = new Scanner(myObj);
    	while(myread.hasNextLine()) {
    		String data = myread.nextLine();
    		
    		System.out.println(data);
    	}
    	
    	myread.close();
    	
    }catch(FileNotFoundException e) {
    	System.out.println("an error occured");
    }

	}

}
