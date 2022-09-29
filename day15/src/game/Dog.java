package game;

public class Dog extends Animal{

	public Dog(String name, int hp, int feed) {
		super(name, hp, feed);
	}
	
	//먹기. 부모에 정의된 메소드 그대로 사용.
	//산책하기
	@Override
	public void walk() {
		this.hp -= 2;
		super.walk();
		/* this.hp -= 3; this.feed++; this.show(); < 지금은 show가 프라이빗이라 못씀. 쓰고싶으면 퍼블릭으로 바꾸면 됨 */
	}
	//놀아주기
	@Override
	public void play() {
		System.out.println(this.name+"이랑 노는중!");
		for(int i=0; i<5; i++) {
			System.out.print("멍멍!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
		super.play();
	}
	
}
