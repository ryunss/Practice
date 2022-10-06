package day05;

public class MathTest {

	public static void main(String[] args) {
//		Math.abs(a)		: a 값의 절대값을 리턴
		System.out.println(Math.abs(-16)); // 16
//		Math.ceil(a)	: 올림
		System.out.println(Math.ceil(11.14)); // 12
		System.out.println(Math.ceil(-11.14)); // -11
//		Math.floor(a)	: 내림
		System.out.println(Math.floor(11.14)); // 11
		System.out.println(Math.floor(-11.14)); // -12
//		Math.round(a)	: 반올림
		System.out.println(Math.round(11.6)); // 12
//		Math.max(a, b)	: a b 중 최댓값
		System.out.println(Math.max(10, 5)); // 10
//		Math.min(a, b)	: a b 중 최솟값
		System.out.println(Math.min(10, 5)); // 5
//		Math.pow(a, b)	: 제곱
		System.out.println(Math.pow(3, 3)); // 27
//		Math.sqrt(a)	: 제곱근(루트)
		System.out.println(Math.sqrt(9)); // 3
	}
}
