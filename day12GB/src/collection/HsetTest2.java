package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HsetTest2 {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		
		// 막 대충 서있는 애들을 줄 세우는 방법
		Iterator<Integer> iter = set.iterator();
		
		while(iter.hasNext()) { // 다음 번호가 있으면 참 없으면 펄스
			System.out.println(iter.next()); // 다음 손님이요
		}
		
		// iterator는 한번 지나간 원소는 다시 불러올 수 없다
		// 다시 객체화를 진행하여 순서를 부여해주고 처음부터 순회하여 원소를 다시 불러와야 한다.
		iter = set.iterator();
		
	}
}
