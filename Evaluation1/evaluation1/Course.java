package com.evaluation1;
//Question 2:

public class Course {
	int courseId;
	String courseName;
	int courseFee;
	
	
	
	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCourseFee() {
		return courseFee;
	}

	public void setCourseFee(int courseFee) {
		this.courseFee = courseFee;
	}

	void displayCourseDetails() {
		System.out.println(this.courseId);
		System.out.println(this.courseName);
		System.out.println(this.courseFee);
	}
	
	static void authenticate(String username, String password) {
		if(username.equals("Admin") && password.equals("1234")) {
			Course c1 = new Course();
			c1.setCourseId(121);
			c1.setCourseName("Web Development");
			c1.setCourseFee(300000);
			c1.displayCourseDetails();
		}else {
			System.out.println("Invalid Username or password");
		}
	}
	
	public static void main(String[] args) {
		Course c = new Course();
		c.authenticate("Admin", "1234");
		c.authenticate("Admin", "123");
	}
	
}

/*
 1. courseId: int

2. courseName: String
3. courseFee: int
*/