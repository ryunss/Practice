package day05;

public class StrTest {

	public static void main(String[] args) {
		String msg = "Hello Java!";
		//"문자열1".split("문자열2") : "문자열1"을 "문자열2" 기준으로 나누기 
		// (나뉘어진 값들이 담겨있는 String[] 반환)
		String[] arr1 = msg.split(" "); // {"Hello", "Java!"};
		System.out.println("띄어쓰기 앞부분 : "+arr1[0]);
		System.out.println("띄어쓰기 뒷부분 : "+arr1[1]);
		
		String[] arr2 = msg.split("u"); // {"Hello Java!} : 
		// split은 나누지 못한다면 전체 문자열 한개가 담겨있는 String[] 반환
		System.out.println(arr2[0]);
		
		// "문자열1".indexOf("문자열2") : "문자열1"에서 "문자열2"가 시작하는 인덱스
		int idx = msg.indexOf("J"); // 6
		System.out.println("J의 인덱스 : "+idx);
		idx = msg.indexOf("Java"); // 6
		System.out.println("Java의 인덱스 : "+idx);
		idx = msg.indexOf("t"); // -1 (존재하지 않음)
		System.out.println("t의 인덱스 : "+idx);
		
		// "문자열1".replace("문자열2", "문자열3") : "문자열1"에서 "문자열2"를 찾아 "문자열3"으로 변환
		// 원본("문자열1")은 그대로 유지, 바뀐 문자열 값이 리턴
		String newMsg = msg.replace("Hello", "Bye");
		System.out.println("원본 : "+msg);
		System.out.println("replace 후 : "+newMsg);
		
		// "문자열".substring(n) : "문자열"을 n부터 끝까지 잘라서 돌려준다. (return string)
		String subMsg1 = msg.substring(6);
		System.out.println("6번째부터 끝까지 : "+subMsg1);
		
		// "문자열".substring(n,m) : "문자열"을 n부터 m 이전까지 잘라서 돌려준다. (return string)
		String subMsg2 = msg.substring(6, 8);
		System.out.println("6번쨰부터 8이전까지 : "+subMsg2);
		
		// "문자열".trim() : "문자열" 양 옆에 있는 공백들을 제거(String)
		System.out.println("                  java        ".trim());
		
		// 원본바꿔서 쓰고싶을 때
		msg = msg.replace("Hello", "Bye");
		System.out.println(msg);
		
	}

}





