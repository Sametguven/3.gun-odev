package gun3odev2;

public class InstructorManager extends UserManager{
	public void add(Instructor ýnstructor) {
		System.out.println(ýnstructor.getCourses() + " Kursunun 1.dersini ekleyebilirsiniz");
	}

	public void addMultiple(Instructor[]ýnstructors) {
		for(Instructor ýnstructor:ýnstructors)
			add(ýnstructor);
	}
}
