package army;

public class Sergeant extends SoldierAdapter{

	@Override
	public void eat() {
		System.out.println("눈에 보이지는 않지만 밥은 먹고 다닌다.");
	}

	@Override
	public void sleep() {
		System.out.println("하루종일 잔다.");
	}

	
}
