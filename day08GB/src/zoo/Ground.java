package zoo;

public class Ground {

	public static void main(String[] args) {
		// 동물 세마리 만들어서 각 동물마다 다른 울음소리로 울게 하기
		// 동물 세마리 만들어서 각 동물마다 특징적인 행동을 반복문 이용해서 하나씩 하기
		Animal[] animal = {
				new Cat("cat"),
				new Dog("dog"),
				new Turtle("turtle")
		};
		
		for (int i = 0; i < animal.length; i++) {
			animal[i].cry();
		}
		System.out.println("==================");
		for (int i = 0; i < animal.length; i++) {
			if(animal[i] instanceof Cat) {
				((Cat)animal[i]).angry();
			}else if(animal[i] instanceof Dog) {
				((Dog)animal[i]).sleep();
			}else if(animal[i] instanceof Turtle) {
				((Turtle)animal[i]).happy();
			}
		}
		
		System.out.println("==================");
		Cat c = new Cat("cat");
		c.angry();
		Dog d = new Dog("dog");
		d.sleep();
		Turtle t = new Turtle("turtle");
		t.happy();
		
		Animal ani = new Animal("동물");
		ani.cry();
	}

}
