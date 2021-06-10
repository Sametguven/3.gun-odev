package gun3odev2;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.setId(1);
		student.setFirstName("Samed");
		student.setLastName("G�VEN");
		student.setLesson("Java Kursu 1.ders");
		
		Instructor �nstructor = new Instructor();
		�nstructor.setId(2);
		�nstructor.setFirstName("Engin");
		�nstructor.setLastName("Demiro�");
		�nstructor.setCourses("Java");
		
		UserManager userManager = new UserManager();
		
		User[]users = {student,�nstructor};
		userManager.addMultiple(users);
// -------------------------------------------------------------------------------	
		InstructorManager �nstructorManager = new InstructorManager();
		
		Instructor[]�nstructors = {�nstructor};
		�nstructorManager.addMultiple(�nstructors);
//---------------------------------------------------------------------------------
		StudentManager studentManager = new StudentManager();
		
		Student[]students = {student};
		studentManager.addMultiple(students);
	}

}
