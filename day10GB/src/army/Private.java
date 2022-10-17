package army;

public class Private implements Soldier{

	@Override
	public void eat() {
		System.out.println("허리를 펴고 각을 잡고 90도로 팔을 들고 식사를 한다");
	}

	@Override
	public void sleep() {
		System.out.println("부모님을 생각하다 잠에 들지만, 야밤에 누군가 깨워서 데리고 나간다.");
	}

	@Override
	public void work() {
		System.out.println("온 힘을 다해 일을 하지만 효율이 없다.");
	}

	@Override
	public void hello() {
		System.out.println("충!!!!성!");
	}
	
}
