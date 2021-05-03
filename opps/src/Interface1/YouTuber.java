package Interface1;

public abstract interface YouTuber extends VideoEditor {
	
     //public abstract final int x = 4; by default every variable is static final and int; 
	 abstract void makeVideo();
	 
	 default void uploadVideo() {
		 System.out.println("uploading video");  // in java 11 it we can implement this type of method having body 
	 }

	abstract void editVideo();

}
