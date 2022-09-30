package day02;

import java.util.Scanner;

public class ForTask {

	public static void main(String[] args) {
		// 초기식은 i = 0; , 증감식은 i++ 으로 해보자
		Scanner sc = new Scanner(System.in);
		
		// 1부터 10까지 출력하기
		System.out.println("1부터 10까지 출력하기");
		for(int i = 0; i<10; i++) {
			System.out.print(i+1 + " ");
		}
		System.out.println();
		
		// 10부터 1까지 출력하기
		System.out.println("10부터 1까지 출력하기");
		for(int i = 0; i<10; i++) {
			System.out.print(10-i + " ");
		}
		System.out.println();
		
		// 12부터 3씩 증가하며 13번 출력하기
		System.out.println("12부터 3씩 증가하며 13번 출력하기");
		for(int i = 12; i<=48; i+=3) {
			System.out.print(i+ " ");
		}							
		System.out.println();
		
		// 100 94 88 82 ... 28 출력하기
		System.out.println("100 94 88 82 ... 28 출력하기");
		for(int i = 0; i<13; i++) {
			System.out.print(100-(i*6) + " ");
		}
		System.out.println();
		
		// 1부터 10까지의 총 합 구하기
		System.out.println("1부터 10까지의 총 합 구하기");
		int sum = 0;
		for(int i=0; i<=10; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		// n 하나 입력받아서 1부터 n까지의 총 합 구하기
		System.out.println("n 하나 입력받아서 1부터 n까지의 총 합 구하기");
		System.out.print("숫자 하나 입력 : ");
		int n = sc.nextInt();
		sum = 0;
		for(int i = 0; i<=n; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		// n, m 입력받아서 n부터 m까지 출력하기
		System.out.println("n, m 입력받아서 n부터 m까지 출력하기");
		System.out.print("n 정수 입력 : ");
		n = sc.nextInt();
		System.out.print("m 정수 입력 : ");
		int m = sc.nextInt();
		
		for(int i = n; i<=m; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 1부터 100까지 중 짝수만 출력하기
		System.out.println("1부터 100까지 중 짝수만 출력하기");
		sum = 0;
		for(int i = 1; i<=100; i++) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		// 1부터 100까지 중 3과 5의 공배수만 출력하기
		System.out.println("1부터 100까지 중 3과 5의 공배수만 출력하기");
		for(int i=1; i<=100; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
		// A부터 F까지 출력하기
		System.out.println("A부터 F까지 출력하기");
		for(int i=0; i<6; i++) {
			System.out.print((char)(65+i));
		}
		System.out.println();
		
		// 1부터 100까지 중 3의 배수와 5의 배수 출력하되 공배수는 제외하고 출력하기
		System.out.println("1부터 100까지 중 3의 배수와 5의 배수 출력하되 공배수는 제외하고 출력하기");
		for(int i=1; i<=100; i++) {
			if(i % 3 == 0 || i % 5 == 0) {
				if(i % 3 == 0 && i % 5 == 0) {
					continue;
				}
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		// AbCdEf... Yz 출력하기
		System.out.println("AbCdEf... Yz 출력하기");
		for(int i=1; i<=26; i++) {
			if(i%2==1) {
				System.out.print((char)(65+i-1));
			} else if(i%2==0) {
				System.out.print((char)(97+i-1));
			}
		}
		System.out.println();
		
		// 중첩반복문 사용하지 않고 구구단 전부 출력하기
		System.out.println("중첩반복문 사용하지 않고 구구단 전부 출력하기");
		int j = 1;
		int sub = 0;
		for(int i=1; i<=9; i++) {
			System.out.println(j+"*"+i+"="+j*i);
			sub++;
			if(sub == 9) {
				j++;
				sub = 0;
				i = 0;
			}
			
			if(j>9){
				break;
			}
			
		}
		System.out.println();
		
		// 10진수 숫자 입력받아서 2진수로 출력하기
		System.out.println("10진수 숫자 입력받아서 2진수로 출력하기");
		System.out.print("10진수 정수 입력 : ");
		int num = sc.nextInt();
		int box = 0;

		// num / 2   >> 5
		// num % 2   >> 0
		
		// num / 2   >> 2
		// num % 2   >> 1
		
		// num / 2   >> 1
		// num % 2   >> 0
		
			
		
		
		// ABCDefghIJKLmnopQRSTuvwxYZ 출력하기
		// AbCDefGHIjklMNOPqrstUVWXYz 출력하기
		
		
	}

}
