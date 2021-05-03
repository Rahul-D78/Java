package File_handling;

import java.io.File;

public class File_Information {
	
		public static void main(String[] args) {
	    
			File myObj = new File("F:\\Java\\newfilef1.txt");
		    
			if(myObj.exists()) {
				
				System.out.println("file name " + myObj.getName());
				System.out.println("file path " + myObj.getAbsolutePath());
				System.out.println("can read " + myObj.canRead());
				System.out.println("can write " + myObj.canWrite());
				System.out.println("file size in bytes" + myObj.length());
				
				
			}else {
				System.out.println("file does not exists");
			}
			}

	}


