package day02;

import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String choice = "0";
		
		while(true) {		
				System.out.println("다음 중 프로그래밍 언어가 아닌것은?"
						+ "\n1. C언어\n2. Java\n3. 망둥어\n4. 파이썬\n0. 나가기");
				System.out.print("정답 : ");
				choice = sc.next();
				
				//"문자열1".equals("문자열2");
				if(choice.equals("3")) {
					System.out.println("정답입니다");
				}else if(choice.equals("1")|| choice.equals("2") || choice.equals("4")) {
					System.out.println("오답입니다");			
				}else if(choice.equals("0")){
					System.out.println("안녕히가세요");
					break;
				}else{
					System.out.println("입력이 잘못되었습니다.");
				}
			}
		} // end while
	}
