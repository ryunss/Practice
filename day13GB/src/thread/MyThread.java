package thread;

public class MyThread extends Thread{
	String data;
	
	public MyThread(String data) {
		this.data = data;
	}

	@Override
	public void run() {
		for (int i = 0; i <10; i++) {
			System.out.print(data);
			try {
				sleep(1000); // 상속받았기 때문에 Thread.sleep 로 할 필요 없음
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
	}
}
