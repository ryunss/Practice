package day18;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class WriterTask {

	public static void main(String[] args) {
		// 해당 프로젝트 폴더 내에 task.txt 파일을 만들어서
		// 0번째 줄입니다.
		// 1번째 줄입니다.
		// 2번째 줄입니다.
		// ...
		// 8번째 줄입니다.
		// 9번째 줄입니다.
		
		//출력하기
		
		File f = new File("task.txt");
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter(f);
			bw = new BufferedWriter(fw);
			
			for(int i=0; i<9; i++) {
				bw.write((i+1)+"번째 줄입니다.\n");
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				if(bw != null) { bw.close(); }
				if(fw != null) { fw.close(); }
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
