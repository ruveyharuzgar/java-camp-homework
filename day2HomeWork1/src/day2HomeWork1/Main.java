package day2HomeWork1;

public class Main {

	public static void main(String[] args) {
		Category category1 = new Category(1, "Programlama");

		Instructor instructor1 = new Instructor(1, "Engin Demiroð");

		Course course1 = new Course(1, "Programlamaya Giriþ için Temel Kurs", "Engin Demiroð", "Programlama");
		Course course2 = new Course(2, "Yazýlým Geliþtirici Kampý(C#-ANGULAR)", "Engin Demiroð", "Programlama");
		Course course3 = new Course(3, "Yazýlým Geliþtirici Kampý(JAVA-REACT)", "Engin Demiroð", "Programlama");

		Category[] categories = { category1 };
		for (Category category : categories) {
			System.out.println("Kategoriler:\n" + category.name);
		}

		Instructor[] instructors = { instructor1 };
		for (Instructor instructor : instructors) {
			System.out.println("Eðitmenler:\n" + instructor.name);
		}

		Course[] courses = { course1, course2, course3 };

		System.out.println("Kurslar:");
		for (Course course : courses) {
			System.out.println(course.name);
		}

		System.out.println("***********");

		CategoryManager categoryManager = new CategoryManager();
		categoryManager.update(category1);

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);

		CourseManager courseManager = new CourseManager();
		courseManager.add(course3);
		courseManager.update(course2);

	}

}
