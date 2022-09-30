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
		
		System.out.println(str1.indexOf('e')); // �ڵ�����ȯ��, 0��°���� ã��. ���� �տ� ���� �˷���
		System.out.println(str1.indexOf('e', 5)); // e�� ã�µ� 5��°���� ã�ƶ�.
		System.out.println(str1.indexOf("ice")); // �����ϴ� �ε������� �˷���
		System.out.println(str1.indexOf("e"));
		System.out.println(str1.indexOf("�ȳ�")); // ���� ��� -1�� return
		System.out.println(str1.substring(12)); // 12��°���� ������ �ڸ��ڴ�. is delicious ���
		System.out.println(str1.substring(12, 15)); // 12������ 15-1 ������ �ڸ� (15���� ����X). is ���.
		String[] temp = str1.split("e"); // e�� �������� �ɰ��� �迭
		System.out.println("===================");
		for(int i=0; i<temp.length; i++) {
			System.out.println(temp[i]);
		}
		String[] ar = {"�ȳ�", "�ϼ���", "�ݰ�����"};
		// join() ����ƽ �޼ҵ�
		System.out.println(String.join("hello", ar));
	}

}
