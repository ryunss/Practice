package zoo;

public class Turtle extends Animal{

	String name;

	public Turtle() {}

	public Turtle(String name) {
		this.name = name;
	}
	
	void cry() {
		System.out.println(name + " 거북..울기");
	}
	
	void happy() {
		System.out.println(name + "^^거북거북^^");
	}
	
}
