package gun3odev2;

public class InstructorManager extends UserManager{
	public void add(Instructor żnstructor) {
		System.out.println(żnstructor.getCourses() + " Kursunun 1.dersini ekleyebilirsiniz");
	}

	public void addMultiple(Instructor[]żnstructors) {
		for(Instructor żnstructor:żnstructors)
			add(żnstructor);
	}
}
