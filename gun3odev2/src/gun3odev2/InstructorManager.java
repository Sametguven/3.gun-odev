package gun3odev2;

public class InstructorManager extends UserManager{
	public void add(Instructor �nstructor) {
		System.out.println(�nstructor.getCourses() + " Kursunun 1.dersini ekleyebilirsiniz");
	}

	public void addMultiple(Instructor[]�nstructors) {
		for(Instructor �nstructor:�nstructors)
			add(�nstructor);
	}
}
