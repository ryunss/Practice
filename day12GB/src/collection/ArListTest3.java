package collection;

import java.util.ArrayList;

public class ArListTest3 {
	public static void main(String[] args) {
		ArrayList<User> user = new ArrayList<User>();
		
		user.add(new User(1, "apple", "1234", "김사과"));
		user.add(new User(2, "banana", "1234", "반하나"));
		user.add(new User(3, "cherry", "1234", "이체리"));
		
		System.out.println(user);
		
		user.remove((User)new User(2, "banana", "1234", "반하나"));
		
		System.out.println(user);
	}
	
}
