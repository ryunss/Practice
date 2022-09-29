package day01;


// Ctrl + Spacebar : 자동완성
public class PrintTest {

//	main 메소드 : 프로그램의 시작점, 진입점
	
	public static void main(String[] args) {
		System.out.println("Hello Java!");
		System.out.println(10);
		System.out.println(5+3);
		System.out.println(5>3);
		
		// '0' 문자  , "0" 문자열 , 0 숫자
		
		// 이름 : 정다솔
		// 나이 : 22살
		// 키 : 182.7cm
		
		System.out.printf("이름 : %s\n나이 : %d살\n키 : %.1fcm\n", "정다솔", 22, 182.7);
	}

}
