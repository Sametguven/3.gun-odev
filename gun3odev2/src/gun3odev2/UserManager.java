package gun3odev2;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getId() + " Numaral� kullan�c� giri� yapt�");
		System.out.println("Ad� : " + user.getFirstName());
		System.out.println("Soyad� : " + user.getLastName());
	}

	//bulk insert:Ayn� anda birden fazla m��teri eklemeye balk operasyonu denir.
	
	public void addMultiple(User[]users) {
		for(User user:users)
			add(user);
	}
	
}
