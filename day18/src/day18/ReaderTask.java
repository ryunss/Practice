package day18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReaderTask {

	public static void main(String[] args) {
		// 사용자에게 인덱스번호를 입력받아 task.txt 파일에서 해당 인덱스번호에 있는 문장을 출력하시오.
		// ex) 인덱스 >> 5
		// 5번째줄입니다.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인덱스 번호를 입력하세요 >> ");
		int num = sc.nextInt();
		
		File f = new File("task.txt");
		BufferedReader br = null;
		FileReader fr = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);

			for(int i=0; i<num; i++) {
				if(i+1==num) {
					System.out.println(br.readLine());
				}
				br.readLine();
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) { br.close(); }
				if(fr != null) { fr.close(); }
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
