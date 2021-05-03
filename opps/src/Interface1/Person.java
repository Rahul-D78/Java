package Interface1;

public class Person implements Student, YouTuber{

	public static void main(String[] args) {
		
         Person obj = new Person();
         obj.Study();
         obj.makeVideo();
         
        YouTuber obj2 = obj;
        obj2.editVideo();
        
        obj2.uploadVideo();
      //  obj2.makeVideo();
     // obj2.study();   // upcasting basically a typecasting or reference
   
        //Youtuber obj2 = new Youtuber();  can not be instanciated
	}

	@Override
	public void Study() {
	    System.out.println("student is studying");	
	}

	@Override
	public void makeVideo() {
        System.out.println("youtuber is making some good stuffs");
		
	}

	@Override
	public void editVideo() {
		System.out.println("person is editting");		
	}
	
	
	

}
