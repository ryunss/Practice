package cage;
// 조류
public class Bird extends Animal{

	public Bird(String name) {
		super(name);
	}
	
	public void fly() {
		System.out.println(name+ " 나는중");
	}
	
}
