package day3Homework;

public class InstructorManager extends UserManager {

	public void add(Instructor instructor) {
		System.out.println(instructor.getInstructorCourseName()+" kursu eklendi");
	}

	public void deleteHomeWork(Instructor instructor) {
		System.out.println(instructor.getInstructorHomework()+" ödev silindi");
	}

}
