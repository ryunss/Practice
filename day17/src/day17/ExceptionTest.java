package day17;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		// 사용자에게 인덱스번호와 정수를 입력받아서 배열속 해당 요소를 정수로 나눈 결과를 출력하는 프로그램
		// x 번째 방을 y 로 나눠줘.
		Scanner sc = new Scanner(System.in);
		
		int[] ar = {10, 20, 30};
	
		try {
			System.out.print("인덱스 >> ");
			int idx = sc.nextInt();
			System.out.print("나눌 값 >> ");
			int num = sc.nextInt();
			System.out.println("결과 : "+ ar[idx] / num);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 번호를 확인하세요.");
		}catch(ArithmeticException e) {
			System.out.println("0으로는 나눌 수 없습니다.");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("오류 발생함");
		}finally {
			System.out.println("예외가 발생하든 안하든 무조건 실행되는 영역");
		}
		System.out.println("프로그램 종료됨");
	}

}
