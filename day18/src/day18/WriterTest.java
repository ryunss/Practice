package day18;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriterTest {

	public static void main(String[] args) {
//		1. 파일객체 만들기 // file 클래스. 생성자의 매개변수로는 내가 사용할 파일의 경로를 써준다. (해당 파일이 없는 경우에는 만들어줌)
		//절대 경로 C:\\Users\\doyex\\Desktop\\1900_java_jhr\\memo\\test.tx
		File f = new File("test2.txt"); // ..\\test2.txt 하면 상위폴더로 이동함.
		//상대 경로 ex) test2.txt // 항상 기준은 해당 프로젝트 폴더
//		2. 스트림열기 (스트림 = 데이터가 전송되는 통로) // FileWriter 클래스. 생성자의 매개변수로는 내가 사용할 파일 객체를 넘겨준다.
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(f, true); // 생성자 매개변수로 boolean 값을 true로 넘거져무녀 덧붙이기 모드(기존 내용은 유지 뒤에 덧붙임)
			//fw = new FileWriter(f); // 기본은 false 덮어쓰기 모드 (기존 내용 전체 덮어쓰기)
//		2-1. 버퍼 생성 // BufferedWriter. 생성자의 매개변수로는 내가 만든 스트림을 넘겨준다.
			bw = new BufferedWriter(fw);
//		3. 파일 입력 / 출력 // write() : 괄호 안에 있는 문자열을 파일에 출력해주는 메소드
			bw.write("상대경로를 활용하여 출력해봄\n");
		
		} catch (Exception e) {
			e.printStackTrace();
		} // IOException 에러 발생함. 컴파일예외(실행전 에러 발생)
		finally {
				try {
				//	4-0. 버퍼닫기
					if(bw != null) { bw.close(); }
				//	4. 스트림닫기
					if(fw != null) { fw.close(); }
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
}
