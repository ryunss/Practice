package stringTest;

public class StringTest {

	public static void main(String[] args) {
		String str1 = "apple juice is delicious";
		
		System.out.println(str1.length());
		
		System.out.println(str1.charAt(0));
		
		for(int i=0; i<str1.length(); i++) {
			System.out.print(str1.charAt(i));
		}
		System.out.println();
		
		System.out.println(str1.indexOf('e')); // 자동형변환됨, 0번째부터 찾음. 가장 앞에 것을 알려줌
		System.out.println(str1.indexOf('e', 5)); // e를 찾는데 5번째부터 찾아라.
		System.out.println(str1.indexOf("ice")); // 시작하는 인덱스값을 알려줌
		System.out.println(str1.indexOf("e"));
		System.out.println(str1.indexOf("안녕")); // 없을 경우 -1이 return
		System.out.println(str1.substring(12)); // 12번째부터 끝까지 자르겠다. is delicious 출력
		System.out.println(str1.substring(12, 15)); // 12번부터 15-1 번까지 자름 (15번은 포함X). is 출력.
		String[] temp = str1.split("e"); // e를 기준으로 쪼개진 배열
		System.out.println("===================");
		for(int i=0; i<temp.length; i++) {
			System.out.println(temp[i]);
		}
		String[] ar = {"안녕", "하세요", "반가워요"};
		// join() 스태틱 메소드
		System.out.println(String.join("hello", ar));
	}

}
