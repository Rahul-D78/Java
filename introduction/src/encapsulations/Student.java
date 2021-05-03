package encapsulations;

public class Student {
	
	private int age;
	
	
	public int getAge() {
	    return age;
	}
	public void setAge(int age) {
		if(age > 20) {
			System.out.println("not eligible");
			
		}else {
			this.age = age;
		}
		
	}
	    }
