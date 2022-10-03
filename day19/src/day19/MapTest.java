package day19;

import java.awt.SystemColor;
import java.util.HashMap;
import java.util.Map.Entry;

public class MapTest {

	public static void main(String[] args) {
		HashMap<String, Integer> scores = new HashMap<String, Integer>();
		System.out.println(scores);
		
		// �������� ������ �ȴ�. // value �� �ߺ��� ����������, key�� �ߺ��� �ȵȴ�.
		// put(key,value) : key�� �ߺ����� �ʴ´ٸ� ����߰�, key�� �ߺ��ȴٸ� ��� ����
		scores.put("����", 80);
		scores.put("����", 70);
		scores.put("����", 100);
		scores.put("����", 100);
		
		System.out.println(scores);
		System.out.println(scores.size());
		
		// get(key) : �ش� value�� return
		System.out.println(scores.get("����"));
		System.out.println(scores.get("����"));
		System.out.println(scores.get("����"));
		System.out.println(scores.get("����"));
		
		// remove(key) : key�� value �� �� ����
		scores.remove("����");
		System.out.println(scores);
		System.out.println("-----------------------------");
		// �ݺ����� ���� ���� ��� ����ϱ�
//		for( a : scores) {
//		
//		}
		// keySet() : �� ���� key������ ��Ƴ��� Set�� return
		System.out.println(scores.keySet());
		for(String key : scores.keySet()) {
			System.out.println(key + ":" + scores.get(key));
		}
		
		// values()
		System.out.println(scores.values());
		for(Integer value : scores.values()) {
			System.out.println(value);
		}
		
		// entrySet() : �ʿ��� entry���� ��ҷ� ����ִ� Set�� return
		// entry : key �� value �� ��
		for( Entry<String, Integer> entry : scores.entrySet()) {
			System.out.println("-------");
			System.out.println(entry);
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}

}