package anonymous;

public class Banapresso {
	void openCafe(Cafe c) {
		System.out.println("바나프레소가 열렸습니다.");
		c.sell();
		c.clean();
		System.out.println("바나프레소가 닫혔습니다.");
	}
}
