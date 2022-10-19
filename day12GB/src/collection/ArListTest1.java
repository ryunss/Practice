package collection;

import java.util.ArrayList;

public class ArListTest1 {
	public static void main(String[] args) {
		// String[] arData1 = new String[???];
		ArrayList<String> arData1 = new ArrayList<String>();
		
		// ArrayList에 요소 추가하기
		arData1.add("Hello");
		arData1.add("Collection");
		arData1.add("So");
		arData1.add("Easy");
		
		System.out.println(arData1);
		//					ArrayList의 요소 개수
		for (int i = 0; i < arData1.size(); i++) {
			//								ArrayList에서 요소 가져오기
			System.out.println(i+"번째 방에는 "+arData1.get(i));
		}
		
		/* 빠른포문으로 출력하기
		for(String ar : arData1) {
			System.out.println(ar);
		}
		*/
		// ArrayList의 요소 수정하기
		arData1.set(3, "Hard");
		
		System.out.println(arData1);
		
		// ArrayList의 요소 삭제하기
		arData1.remove("Hard");
		System.out.println(arData1);
		
		ArrayList<Integer> arData2 = new ArrayList<Integer>();
		
		arData2.add(10);
		arData2.add(20);
		arData2.add(30);
		arData2.add(40);
		arData2.add(50);
		
		System.out.println(arData2);
		
//		arData2.remove(40); 에러. index 번호로 삭제하는 방법도 있기때문. remove(int index)
		// remove(Object o) 객체를 넘겨라. 라는 뜻. 그래서 박싱 업캐스팅 하면 됨
		arData2.remove((Integer)40);
		System.out.println(arData2);
	}
}
