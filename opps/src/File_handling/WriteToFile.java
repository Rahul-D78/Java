package File_handling;

import java.io.FileWriter;

import java.io.IOException;

public class WriteToFile {
	


	public static void main(String[] args) {
		
		try {
		FileWriter myWriter = new FileWriter("F://java//filef3.txt");
		myWriter.write("i have to bye a rasbery pi and a monitor in january at any how... ");
		myWriter.close();
		System.out.println("successfully wrote to the file");
		}catch(IOException e) {
			System.out.println("error occured");
		}

	}

}
