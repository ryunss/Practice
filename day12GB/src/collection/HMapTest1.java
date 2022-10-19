package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HMapTest1 {
	public static void main(String[] args) {
		HashMap<String, String> dict = new HashMap<String, String>();
		
		// HashMap에 요소 추가하기
		dict.put("fly", "날다");
		dict.put("walk", "걷다");
		dict.put("run", "뛰다");
		
		// HashMap의 구조 간단하게 파악하기
		System.out.println(dict);
		
		// HashMap의 요소 수정하기
		// 기존에 존재하던 Key에 새로운 Value를 추가하면 수정이 일어난다.
		dict.put("run", "달리다");
		System.out.println(dict);
		
		// HashMap의 요소 삭제하기
//		System.out.println(dict.remove("run")); // Value의 값을 꺼내오고 삭제 함. Key run Value 달리다
//		System.out.println(dict);
//		
//		System.out.println(dict.remove("run","달리다")); // 키와밸류가 있는지 없는지 확인해서 boolean 타입으로 성공 실패를 리턴 하고 지움.
//		System.out.println(dict);
		
		// HashMap에서 요소 조회하기
		System.out.println(dict.get("walk"));
		
		String[] keys = {"fly","walk","run"};
		
		//					HashMap의 쌍의 개수
		for (int i = 0; i < dict.size(); i++) {
			System.out.println(dict.get(keys[i]));
		}
		
		Set<String> keyset = dict.keySet();
		Iterator<String> keyiter = keyset.iterator();
		for (int i = 0; i < dict.size(); i++) {
			System.out.println("키 : "+keyiter.next());
		}
		
		Collection<String> values = dict.values();
		Iterator<String> valueiter = values.iterator();
		for (int i = 0; i < dict.size(); i++) {
			System.out.println("값: "+valueiter.next());
		}
		
		Set<Entry<String, String>> et = dict.entrySet();
	 	Iterator<Entry<String, String>> etiter = et.iterator();
	 	
	 	Entry<String, String> entry = etiter.next();
	 	
	 	System.out.println("엔트리의 키 : " + entry.getKey());
	 	System.out.println("엔트리의 값 : " + entry.getValue());
	 	
	}
}
