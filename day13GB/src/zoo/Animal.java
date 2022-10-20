package zoo;

public class Animal implements Runnable{
	String name;

	public Animal(String name) {
		this.name = name;
	}
	
	void cry() {}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			cry();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
