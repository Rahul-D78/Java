package Thread;

/*class MyTask extends Thread {  //mytask is a thread
	public void run() {
		for(int doc = 0;doc <= 10;doc++) {
			System.out.println("printing document no  " + doc + "printer 2");
		}
	}
}*/


class CA {
	
}

class MyTask extends CA implements  Runnable {  //mytask is a thread
	public void run() {
	      	for(int doc = 0;doc <= 10;doc++) {
			System.out.println("printing document no  " + doc + "printer 2");
		}
	}
		
	}


public class Ex {

	//main method represents main thread
	public static void main(String[] args) {
		
		//my task and main thred are working paralally
        //	MyTask task = new MyTask();
       //		task.start();
		//job 1
		System.out.println("application started");
	     
		Runnable r = new MyTask();
		Thread task = new Thread(r);
		task.start();
		

		//job 2
		for(int doc = 0; doc <= 10;doc++) {
			System.out.println("Document printed " + doc + "printer 1");
		}
		//job 3
		System.out.println("application ented");

		

	}

}
