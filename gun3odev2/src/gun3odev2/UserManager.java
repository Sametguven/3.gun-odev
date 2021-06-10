package gun3odev2;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getId() + " Numaralý kullanýcý giriþ yaptý");
		System.out.println("Adý : " + user.getFirstName());
		System.out.println("Soyadý : " + user.getLastName());
	}

	//bulk insert:Ayný anda birden fazla müþteri eklemeye balk operasyonu denir.
	
	public void addMultiple(User[]users) {
		for(User user:users)
			add(user);
	}
	
}
