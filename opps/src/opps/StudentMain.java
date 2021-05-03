package opps;

public class StudentMain {

	public static void main(String[] args) {
		
		Student a = new Student();
		
		Student b = new Student();
		
		a.age = 7;
		a.grade = "2nd";
		Student.name = "Ram";
		Student.doThis();
		
		Student.name = "ram";
		b.age = 8;
		b.grade = "1st";
		Student.doThis();
		
		a.display();
		b.display();
		

	}

}
