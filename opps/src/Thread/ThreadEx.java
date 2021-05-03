package Thread;

class G extends Thread{
	
	public void run() {
		for(int doc = 0;doc <= 10;doc++) {
			System.out.println("Doc no " + doc);
		}
	}
}

public class ThreadEx {
	
	public static void main(String []args) {
		
		
		System.out.println("Application started");
		
		
		
		System.out.println("Application ended");
		
		G task = new G();
		task.start();
		
		for(int doc = 0;doc <= 10;doc++) {
			System.out.println("printing documents " + doc + " printer 1");
		}
	}

}
