package collection;

import java.util.ArrayList;

public class ArListTest2 {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		
		// 각 데이터들이 담길 내부 리스트들을 생성해서 추가
		list.add(new ArrayList<Integer>()); // 1행
		list.add(new ArrayList<Integer>()); // 2행
		
		list.get(0).add(10); // 1행 1열에 넣을 값 : 10
		list.get(0).add(20); // 1행 2열에 넣을 값 : 20
		list.get(0).add(30); // 1행 3열에 넣을 값 : 30
		
		list.get(1).add(40); // 2행 1열에 넣을 값 : 40
		list.get(1).add(50); // 2행 2열에 넣을 값 : 50
		list.get(1).add(60); // 2행 3열에 넣을 값 : 60
		
		// 즉, 배열로 치면 2차원배열 2행3열 만든거랑 같음
		
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.get(i).size(); j++) {
				System.out.println(list.get(i).get(j));
			}
		}
	}

}
