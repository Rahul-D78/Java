package list;

public class Pair<X , Y> {
	
	X x;
	Y y;
	
	public Pair(X x, Y y) {
		this.x = x ;
		this.y = y ;
	}
	
	public void getDescription() {
		System.out.println(x + "and"+ y);
	}
	

}

//here x and y denotes to any type may be int string etc..........