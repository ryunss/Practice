package day19;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetTest {

	public static void main(String[] args) {
		HashSet<String> fruits = new HashSet<String>();
		
		System.out.println(fruits);
		System.out.println(fruits.size());
		
		// 순서 X (랜덤으로 배열됨), 중복 허용 X
		fruits.add("사과");
		fruits.add("바나나");
		fruits.add("포도");
		fruits.add("복숭아");
		fruits.add("바나나");
		fruits.add("바나나");
		fruits.add("파인애플");
		fruits.add("파인애플");
		
		System.out.println(fruits);
		// 순서가 없기 때문에 인덱스번호 사용 불가능
//		fruits.get(0);
		
		fruits.remove("파인애플");
		System.out.println(fruits);
		fruits.remove("무화과"); // 없는거 써도 에러도 없고 그냥 없음
		System.out.println(fruits); 
		
		for(String a : fruits) {
			System.out.println(a);
			if(a.equals("바나나")){
				System.out.println("찾앗다");
			}
		}
		System.out.println("-----------------------------");
		
		//iterator() : 순서를 부여해주는 메소드
		Iterator<String> it = fruits.iterator();
		
		// next()
		// hasNext() : 꺼낼 다음 요소가 있다면 true, 없다면 false 가 return
		while(it.hasNext()) {
			System.out.println(it.next());
		}
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		
		Iterator<Integer> iter = nums.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
