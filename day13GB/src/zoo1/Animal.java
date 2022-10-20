package zoo1;

public abstract class Animal{

	String name;
	String gender;
	int age;
	
	public Animal(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	abstract void makeSomeNoise();
}
