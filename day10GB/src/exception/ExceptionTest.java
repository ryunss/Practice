package exception;

public class ExceptionTest {
	public static void main(String[] args) {
		// Alt + Shift + Z > ↓ : try ~ catch 블럭 만들기
		try {
			System.out.println(10/3);			
			System.out.println(10/0);			
			System.out.println(10/5);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없다");
			e.printStackTrace();
		} finally {
			System.out.println("무조건 동작함. 프로그램 종료");
		}
	}
}
