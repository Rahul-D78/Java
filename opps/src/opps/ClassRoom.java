package opps;

public class ClassRoom {
	
	private String sub1;
	private int stn1;
	
	public String getSub() {
		return sub1;
	}

	public void setSub(String sub) {
		this.sub1 = sub;
	}

	public int getStn() {
		return stn1;
	}

	public void setStn(int stn) {
		this.stn1 = stn;
	}

	public void dothis() {
	System.out.println("this is a" + sub1 + " classroom and it has " + stn1 + "student" );
	}
	

}
