package day02;

public class ForTest {

	public static void main(String[] args) {
		// while문을 사용해서
		// 1. 정다솔
		// 2. 정다솔
		// ...
		// 10. 정다솔 
		// 출력하기
		
		int i = 0;
		while(i < 10) {
			i++;
			System.out.println(i+". 정다솔");
		}
		
		System.out.println("===========");
		// while문으로 한거 for문으로 바꿔보기
		for(i = 1; i<=10; i++) {
			System.out.println(i+".정다솔");
		}
		
		System.out.println("=====================");
		for(i = 0; i<10; i++) {
			System.out.print(i + " ");
		}
		
		// 반복횟수 = ( 끝값 - 초기값) / 증감값
		// 끝값 = 증감값 * 반복횟수 + 초기값
		for(i=0; i > -20; i-=2) {
			System.out.print(i + " ");
		}
		
		// 100부터 -3씩 하며 13번 반복
		for(i=100; i > 61; i-=3) {
			System.out.print(i + " ");
		}
		
		// for문도 결국 조건식이 참일동안 반복한다.
		// 초기식, 조건식, 증감식은 다 생략이 가능하고
		// 조건을 생략할 시 무한반복
//		for(;true;) {
//			
//		}
		System.out.println();
		System.out.println("---------------------");
		// 2 4 6 8 10 12 14 16 18 20
		for(i=0; i<10; i++) {
			System.out.print(2*i+2 + " ");
		}
		
		System.out.println();
		System.out.println("---------------------");
		
		// 7 5 3 1 -1 -3 -5 -7 -9
		for(i=0; i<9; i++) {
			System.out.print(-2*i+7 + " ");
		}
		//	i	출력할값
		//	0	7
		//	1	5
		//	3	3
		//	4	1
		//	5	-1
		//	6	-3
		
		
	}

}
