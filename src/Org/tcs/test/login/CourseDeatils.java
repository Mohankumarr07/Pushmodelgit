package Org.tcs.test.login;

public class CourseDeatils {
	//method
	private void javaCourse() {
		System.out.println("java course is Strated");
		
	}
	private void phthonCourse() {
			System.out.println("python is not stated");
				
	}
	public static void main(String args[]) {
		
		CourseDeatils c=new CourseDeatils ();// object creation - wr are going to access the method 
		// using object in side the class
	
		c.javaCourse();
		c.phthonCourse();
	
	}
	

}

