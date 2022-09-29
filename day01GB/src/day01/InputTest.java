package day01;

import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 이름은 ? : ");
		String name = sc.next();
		sc.nextLine(); // 버퍼에 있는 값 지우기 위함
		// 이곳 밑으로는 사용자가 이미 입력을 해서 name 이라는 변수에 특정 값이 담겨있다고 가정하고 개발한다.
		System.out.println("안녕하세요 " + name + "님");
		
		System.out.print("주소를 입력하세요 : ");
		String addr = sc.nextLine();
		
		System.out.println("사는곳 : "+addr);
	}

}
