package zoo1;

public class Gound {
	
	public static void main(String[] args) {
		// 동물 세마리 만들어서 동시에 울게하기
		Cat cat = new Cat("냐옹이", "수컷", 5);
		Dog dog = new Dog("멍멍이", "암컷", 6);
		Pig pig = new Pig("꿀꿀이", "수컷", 10);
		
		Thread[] arAnimal = {
				new Thread(cat),
				new Thread(dog),
				new Thread(pig)
		
		};
		
		for (int i = 0; i < arAnimal.length; i++) {
			arAnimal[i].start();
		}
	}
}
