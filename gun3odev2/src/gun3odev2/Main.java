package gun3odev2;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.setId(1);
		student.setFirstName("Samed");
		student.setLastName("GÜVEN");
		student.setLesson("Java Kursu 1.ders");
		
		Instructor ınstructor = new Instructor();
		ınstructor.setId(2);
		ınstructor.setFirstName("Engin");
		ınstructor.setLastName("Demiroğ");
		ınstructor.setCourses("Java");
		
		UserManager userManager = new UserManager();
		
		User[]users = {student,ınstructor};
		userManager.addMultiple(users);
// -------------------------------------------------------------------------------	
		InstructorManager ınstructorManager = new InstructorManager();
		
		Instructor[]ınstructors = {ınstructor};
		ınstructorManager.addMultiple(ınstructors);
//---------------------------------------------------------------------------------
		StudentManager studentManager = new StudentManager();
		
		Student[]students = {student};
		studentManager.addMultiple(students);
	}

}
