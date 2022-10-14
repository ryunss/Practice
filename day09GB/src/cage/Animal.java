package cage;

public class Animal {
	String name;
	
	public Animal(String name) {
		this.name = name;
	}

	public void MakeSomeNoise() {
		System.out.println(name + " 우는중");
	}
	
	public void Move() {
		System.out.println(name + " 움직이는중");
	}
}
