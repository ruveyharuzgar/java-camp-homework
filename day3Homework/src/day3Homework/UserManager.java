package day3Homework;

public class UserManager {
	
    public void  add (User user) {		
		System.out.println("Kullanýcý eklendi "+user.getFirstName());
	}
	public void delete(User user) {		
		System.out.println("Kullanýcý silindi");		
	}
}
