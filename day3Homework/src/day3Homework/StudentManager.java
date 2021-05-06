package day3Homework;

public class StudentManager extends UserManager{
	public void add(Student student) {
		System.out.println(student.getAddress() + " adres eklendi");
	}

	public void uploadHomework() {
		System.out.println("Ödev yüklendi");
	}
}
