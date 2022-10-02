package day18;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderTest {

	public static void main(String[] args) {
//		1. 파일객체 만들기
		FileReader fr = null;
		BufferedReader br = null;
		File f = new File("..//..//memo//day01.txt");
		try {
			// 2. 스트림열기 (스트림 = 데이터가 전송되는 통로)
			fr = new FileReader(f);
			// 2-1. 버퍼 생성
			br = new BufferedReader(fr);
//			3. 파일 입력
			//방법 1
			for(String line = br.readLine(); line != null; line = br.readLine()) {
				System.out.println(line);
			}
			
			
			//방법 2
//			String line = "";
//			while((line = br.readLine()) != null) {
//				System.out.println(line);
//			}
			
			//방법 3
//			String line = br.readLine();
//			while(line != null) {
//				System.out.println(line);
//				line = br.readLine();
//			}
//			
//			System.out.println(br.readLine()); // readLine() : 한 줄 단위의 문자열을 입력받는 메소드
//											   // 더 이상 읽을 것이 없다면 null을 return 한다.
//			System.out.println(br.readLine()); // IOException 잡아줘야함. 캐치 하나 더 만듬.
							// IOE 안에 FileNot 이 있음. 상속 (아래 코드에서 두 캐치 순서를 바꾸면 에러 발생함)
							// 어차피 IOE 안에 FileNot 가 있기 때문에 FileNot 를 없애는 건 상관 없음
		} catch (FileNotFoundException e) { // FileNotFoundException 없는 파일을 쓰면 발생하는 에러
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {			
			try {
//				4-0. 버퍼닫기
				if(br != null) { br.close(); }
//				4. 스트림닫기
				if(fr != null) { fr.close(); }
			} catch (IOException e) {
				e.printStackTrace();
			}

			
		}
	}

}
