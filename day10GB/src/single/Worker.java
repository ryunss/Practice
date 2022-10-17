package single;

// Bridge 를 만들어서 주는 역할. 싱글톤으로 설계
public class Worker {
	private static Bridge bridge;
	
	public static Bridge getInstance() {
		if(bridge == null) {
			bridge = new Bridge();
		}
		return bridge;
	}
}
