package zoo;

public class Turtle extends Animal{

	public Turtle(String name) {
		super(name);
	}
	
	void cry() {
		System.out.println(name + " 거북..울기");
	}
	
	void happy() {
		System.out.println(name + "^^거북거북^^");
	}
	
}
