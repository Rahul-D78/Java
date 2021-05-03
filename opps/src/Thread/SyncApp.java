package Thread;

class Printer{
		
//	synchronized public void printDoc(int numOfCopies, String Docname) { //synchronized method after completion of one thread 
	                                                                    //another thread grts executed
	public void printDoc(int numOfCopies, String Docname) {          
		for(int i = 1; i < numOfCopies; i++) {
			try {
			Thread.sleep(500);
			}catch(InterruptedException e) {
				System.out.println("May throw an exception");
			}
			System.out.println("printing" + Docname +" "+ i );
			}
		}
}

class MyThread extends Thread {
	
	Printer p;
	
	MyThread(Printer p) {
	this.p = p;
		}
     public void run() {
    	 synchronized(p) {    //synchronized block
		    p.printDoc(10, "Rahul's profile");
	}
	}
}
class YourThread extends Thread {
		
		Printer p;
		
		YourThread(Printer p) {
		this.p = p;
			}
		public void run() {
			synchronized(p) {                   
				//Synchronized block
			p.printDoc(10, "someone's profile");
			}
		}
		}
public class SyncApp {

	public static void main(String[] args) {
		
		System.out.println("application started");
		
		Printer printer = new Printer();
		
		MyThread mref = new MyThread(printer);
		YourThread yref = new YourThread(printer); //mythread is having a reference to the printer object
		 											////yourthread is having a reference to the printer objec 
   
//		Runnable r = new MyTask();
	//	Thread task = new Thread(r);
		//task.start();
		
		mref.start();
		/*try {
			mref.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		yref.start();
		
		System.out.println("application ended");
		}
}
