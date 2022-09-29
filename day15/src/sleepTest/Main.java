package sleepTest;

public class Main {

	public static void main(String[] args) {
		// sleep() 메소드,Thread 클래스 안에 있는 스태틱 메소드, 매개변수는 필요있음
		System.out.println("시작");
		
		for(int i=0; i<5; i++) {
			System.out.print("!");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("끝");
	}

}
