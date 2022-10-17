package exception;

import java.io.FileReader;
import java.io.IOException;

public class ThrowsTest {
	public static void main(String[] args) {
		try {
			f(); // throws 하면 호출하는 곳에서 에러 발생. 그래서 호출하는쪽에서 try catch 사용했음.
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	static void f() throws IOException{
		new FileReader("");
	}
}
