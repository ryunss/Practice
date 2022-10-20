package fileio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderTest {
	public static void main(String[] args) {
		
		try {
			FileReader fr = new FileReader("test.txt"); // 파일이 존재하지 않을 수도 있기 때문에 예외처리 해야함.
			System.out.println("파일 준비 완료");
			
			BufferedReader br = new BufferedReader(fr);
			System.out.println("버퍼 준비 완료");
			
			while(true) {
				String line = br.readLine();			
				if(line == null) {
					break;
				}
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("파일이 존재하지 않음");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("파일 읽기 실패");
		}
	}
}
