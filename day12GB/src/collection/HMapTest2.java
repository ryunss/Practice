package collection;

import java.util.HashMap;

public class HMapTest2 {
	public static void main(String[] args) {
		HashMap<User, Integer> users = new HashMap<User, Integer>();
		
		users.put(new User(1, "apple", "1234", "김사과"), 1000);
		users.put(new User(2, "banana", "1234", "반하나"), 2000);
		users.put(new User(3, "cherry", "1234", "이체리"), 3000);
		
		users.remove(new User(2, "banana", "1234", "반하나"));
		
		System.out.println(users);
	}
}
