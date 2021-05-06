package day3Homework;


public class Instructor extends User {
	private String instructorCourseName;
	private String instructorHomework;
	
	public String getInstructorCourseName() {
		return instructorCourseName;
	}
	public void setInstructorCourseName(String instructorCourseName) {
		this.instructorCourseName = instructorCourseName;
	}
	public String getInstructorHomework() {
		return instructorHomework;
	}
	public void setInstructorHomework(String instructorHomework) {
		this.instructorHomework = instructorHomework;
	}
}