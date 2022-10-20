package zoo1;

public class Cat extends Animal implements Runnable{
	
	public Cat(String name, String gender, int age) {
		super(name, gender, age);
	}

	@Override
	void makeSomeNoise() {
		for (int i = 0; i < 10; i++) {
			System.out.println("야옹");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public void run() {
		makeSomeNoise();
	}
}
