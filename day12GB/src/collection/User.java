package collection;

public class User {
	int nusernum;
	String userid;
	String userpw;
	String username;

	public User(int nusernum, String userid, String userpw, String username) {
		this.nusernum = nusernum;
		this.userid = userid;
		this.userpw = userpw;
		this.username = username;
	}
	
	@Override
	public String toString() {
		return nusernum+"번 회원("+userid+") - "+username;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof User) {
			User target = (User)obj;
			
			if(nusernum == target.nusernum) {
				if(userid.equals(target.userid)) {
					return true;					
				}
			}			
		}
		return false;
	}
}
