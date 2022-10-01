package day17;

import java.util.Scanner;

public class Review {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. ����ڿ��� ���ڿ��� �Է� �޾Ƽ� �빮�ڴ� �ҹ��ڷ�, �ҹ��ڴ� �빮�ڷ�, �������� �״�� �����Ͽ� ����Ͻÿ�
		System.out.println("���ڿ� �Է� >> ");
		String input = sc.nextLine();
		// input --> "aA+"
		
		String res = "";
		
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if(ch >= 'a' && ch <= 'z') { // �ҹ��ڶ��
				res += (char)(ch - 32);
			} else if(ch >= 'A' && ch <= 'Z') { // �빮�ڶ��
				res += (char)(ch + 32);
			} else { // �ҹ��ڵ� �ƴϰ� �빮�ڵ� �ƴ϶��
				res += ch;
			}
				
		}
		System.out.println("��� >> " + res);
		
//		res += (char)(input.charAt(0) - 32); // 'a' - 32
//		res += (char)(input.charAt(1) + 32); // 'A' + 32
//		res += input.charAt(2);
		
		
		// 2. ����ڿ��� �̸�, ����, �ּҸ� �Է¹޾Ƽ� �޸��� ����� �ϳ��� ���ڿ��� ����Ͻÿ�
		// ����
		// �̸� >> ȫ�浿
		// ���� >> 10
		// �ּ� >> �����
		
		// ��� : ȫ�浿,10,�����
		String[] info = new String[3];
		
		System.out.print("�̸� >> ");
		info[0] = sc.nextLine();
		System.out.print("���� >> ");
		info[1] = sc.nextLine();
		System.out.print("�ּ� >> ");
		info[2] = sc.nextLine();
		System.out.println(String.join(",", info));
		
		// 3. ����ڿ��� �޴�����ȣ�� �Է¹޾Ƽ� ��ø� �����Ͽ� ����Ͻÿ�.
		// �Է� >> 010-1111-1234
		// ��� >> 01011111234
		
		String phone = sc.nextLine();
		String phoneRes = "";
		
		// ��� 1
//		phoneRes += phone.substring(0,3);
//		phoneRes += phone.substring(4,8);
//		phoneRes += phone.substring(9,13);
		
		// ��� 2
//		for (int i = 0; i < phone.length(); i++) {
//			if(phone.charAt(i) != '-') {
//				phoneRes += phone.charAt(i);
//			}
//		}
		
		// ��� 3
//		String[] temp = phone.split("-"); // {"010", "1111", "1234"}
//		phoneRes = String.join("", temp);
		
		// ��� 4
		phoneRes = phone.replaceAll("-", "");
		
		System.out.println("��� >> " + phoneRes);
		
		// 4. ����ڿ��� ����, ����, �̸��� �޸��� ���Ե� �ϳ��� ���ڿ��� �Է¹޾Ƽ� �ش� ������ 1 �����Ͽ� ����Ͻÿ�
		// �Է� >> 10,����,ȫ�浿
		// ��� >> 11, ����,ȫ�浿
		
		String str = sc.nextLine();
		String strRes = Integer.parseInt(str.substring(0, str.indexOf(","))) + 1 + str.substring(str.indexOf(","));
		System.out.println(strRes);
		
		
		// 5. ����ڿ��� �ѱ۷� ���ڸ� �Է¹޾Ƽ� ���ڷ� �����Ͽ� ����Ͻÿ�
		// �Է� >> �ϰ��̻�
		// ��� >> 1024
		
		System.out.print("�Է� >> ");
		String inputNum = sc.nextLine();
		String hangeul ="�����̻�����ĥ�ȱ�";
		String changedNum = "";
		for (int i = 0; i < inputNum.length(); i++) {
			changedNum += hangeul.indexOf(inputNum.charAt(i));
		}
		System.out.println("��� >> "+changedNum);
	}

}
