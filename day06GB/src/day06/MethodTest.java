package day06;

public class MethodTest {

	public static void main(String[] args) {
			MethodTest m = new MethodTest();
//			int data = 10;
//			m.f1(data);
//			System.out.println(data); // 10
			
			int[] arData = {10,20,30};
			m.f2(arData);
			System.out.println(arData[1]); // 2000 . 

			// 이 내용도 결국 똑같다. arData는 주소값을 담고있다. 해당 주소값에서 방을 찾아 2000 으로 넣었기 때문에 바뀌는게 맞다.
	}
	
	void f1(int data) {
		data += 5;
	}
	void f2(int[] arData) {
		arData[1] = 2000;
	}

}
