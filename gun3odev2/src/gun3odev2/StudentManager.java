package gun3odev2;

public class StudentManager extends UserManager{
	public void add(Student student) {
		System.out.println(student.getLesson() + " izleyebilirsiniz");
	}

	public void addMultiple(Student[]students) {
		for(Student student:students)
			add(student);
	}
}
