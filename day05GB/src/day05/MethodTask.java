package day05;

public class MethodTask {

	public static void main(String[] args) {
		MethodTask m = new MethodTask();
		// 1 ~ 10을 출력하는 메소드
		m.printNum();
		// 1 ~ 10 합 구해주는 메소드
		System.out.println(m.getSum());
		// 1 ~ n 합 구해주는 메소드
		System.out.println(m.getSum(10));
		// 두 정수의 나눗셈 결과를 구해주는 메소드
		System.out.println(m.getDiv(10.5, 10.5));
		// 어떤 문자열을 n번만큼 출력하는 메소드
		m.printString("Java", 5);
		// n부터 m까지의 합을 구해주는 메소드
		System.out.println(m.getSum(2, 5));
		// 문자열을 전부 대문자로 바꿔주는 메소드
		System.out.println(m.getChange("asdfasd fasfke"));
		// 문자열을 거꾸로 바꿔주는 메소드
		System.out.println(m.getReChange("asdfasdf"));
		// 문자열이 숫자로 이루어져 있는지 검사하는 메소드
		System.out.println(m.getStrNum("1211111"));
		// 문자열의 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
		System.out.println(m.getChange2("asdfEEEkasfEkd"));
		// 정수를 한글로 바꿔주는 메소드(1024 -> "일공이사")
		System.out.println(m.getChangeKor(1024));
		
	}
	
	void printNum() {
		for(int i=0; i<10; i++) {
			System.out.print(i+1+" ");
		}
		System.out.println();
	}
	
	int getSum() {
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum+=i;
		}
		return sum;
	}
	
	int getSum(int num) {
		int sum = 0;
		for(int i=1; i<=num; i++) {
			sum+=i;
		}
		return sum;
	}
	
	double getDiv(double num1, double num2) {
		return num1/num2;
	}
	
	void printString(String s, int n) {
		for(int i=0; i<n; i++) {
			System.out.print(s+" ");			
		}
		System.out.println();
	}
	
	int getSum(int num1, int num2) {
		int sum = 0;
		for(int i=num1; i<=num2; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	String getChange(String s) {
		int len = s.length();
		char[] c = new char[len];
		String ch = "";
		
		for(int i=0; i<len; i++) {
			c[i] = s.charAt(i);
			if(c[i] >= 'a') {
				c[i] = (char)(c[i] - 32);
				ch += c[i];
			}
		}
		return ch;
	}
	
	String getReChange(String s) {
		int len = s.length();
		char[] c = new char[len];
		String ch = "";
		
		for(int i=len-1; i>=0; i--) {
			c[i] = s.charAt(i);
			ch += c[i];
		}
		return ch;
	}
	
	String getStrNum(String s) {
		int len = s.length();
		char[] c = new char[len];
		String ch = "";
		
		for(int i=0; i<len; i++) {
			c[i] = s.charAt(i);
			if(c[i] <= '0' || c[i] >= '9') {
				ch = "no";
				break;
			}
			ch = "yes";
		}
		return ch;
	}
	
	String getChange2(String s) {
		int len = s.length();
		char[] c = new char[len];
		String ch = "";
		
		for(int i=0; i<len; i++) {
			c[i] = s.charAt(i);
			if(c[i] >= 'a') {
				c[i] = (char)(c[i] - 32);
				ch += c[i];
			}else {
				c[i] = (char)(c[i] + 32);
				ch += c[i];
			}
		}
		return ch;
	}
	
	// 정수를 한글로 바꿔주는 메소드(1024 -> "일공이사")
	String getChangeKor(int n) {
		String kor = "공일이삼사오육칠팔구";
		String result = "";
		
		while( n != 0) { //1024%10 // 102%10
			result = kor.charAt(n % 10) + result; // 이사+""
			n /= 10; // 102 // 10
		}
		
		return result;
	}
}






















