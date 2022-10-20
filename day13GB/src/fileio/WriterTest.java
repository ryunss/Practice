package fileio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterTest {

	public static void main(String[] args) {
		//절대경로, 상대경로
		//절대경로 : 드라이브 경로부터 전부 써주기( ex. d:\\0900_GB_JDS\\java\\test.txt)
		//상대경로 : 현재 위치를 기준으로 경로를 표현해주기
		// → ./ : 현재경로 ex) ./test.txt : 현재 파일이 속한 폴더 안에 있는 test.txt -> day13 폴더가 현재 경로다!
		// → ../ : 상위폴더 ex) ../test.txt : 현재 위치의 상위폴더에 있는 test.txt
		
		// 만약 ../../fm/test.txt 라 하면 해당 폴더에서 상위폴더로 2번 이동, 그리고 fm폴더 찾아서 들어가면 test.txt가 있다.
		
		try {
			FileWriter fw = new FileWriter("./test.txt", true);
			System.out.println("파일 준비 완료");
			
			BufferedWriter bw = new BufferedWriter(fw);
			System.out.println("버퍼 준비 완료!");
			
			bw.write("Hello\r\n");
			bw.write("Java\r\n");
		
			bw.close();
			System.out.println("파일쓰기완료");
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("폴더 경로 문제.");
		}
	}

}
