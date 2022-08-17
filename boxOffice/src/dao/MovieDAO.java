package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;

import dto.MovieDTO;

//모든 영화정보를 가져다주는 메소드
public class MovieDAO {
	// 영화 수정하는 메소드
	public void update(int rank, String title, String date, String revenue, int view, String screen) throws IOException {
		remove(rank);
		add(title, date, revenue, view, screen);
		
		// 수정할 랭킹을 삭제하고 그 자리에 추가
	}
	
	private int getLastRank() throws IOException {
		int rank = 0;
		
		BufferedReader br = DBConnection.read();
		
		for(String line = br.readLine(); line != null; line = br.readLine()) {
			rank++;
		}
		
		br.close();
		
		return rank;
	}
	
	// 영화 삭제하는 메소드
	public boolean remove(int rank) throws IOException{
		if(rank < 1 || rank > getLastRank()) {
			return false;
		}
		
		
		String contents = "";
		BufferedReader br = DBConnection.read();
		
		for(int i=0; i<rank-1; i++) {
			contents += br.readLine() + "\n";
		}
		br.readLine();
		for(String line = br.readLine(); line != null; line = br.readLine()) {
			contents += Integer.parseInt(line.split("\t")[0])-1 + line.substring(line.indexOf("\t")) + "\n";
		}
		
		br.close();
		
		BufferedWriter bw = DBConnection.write();
		
		bw.write(contents);
		bw.close();
		
		return true;
	}
	// 영화 추가하는 메소드
	public void add(String title, String date, String revenue, int view, String screen) throws IOException{
		String contents = "";	
		int ranking = 0;
		String line = null;
		
		BufferedReader br = DBConnection.read();
		for(line = br.readLine(); line != null; line = br.readLine()) {
			ranking++;
			String[] temp = line.split("\t");
			if(Integer.parseInt(temp[4].replace(",","")) < view) { // 콘마를 비어있는 문자로 바꿈 -> 바꿔서 int 값으로 바꿔줌
				break;
			}
			contents += line + "\n";
		}
		// 반복문이 끝나면 내가 추가할 문장이 삽입될 위치
		contents +=  ranking+"\t"+title+"\t"+date+"\t"+revenue+"\t"+view+"\t"+screen+"\n";
		contents += ++ranking + line.substring(line.indexOf("\t")) + "\n"; // 31,32번째줄이랑 같음 ++ranking == ranking++; 다음줄 ranking
		// 삽입된 이후 기존에 있던 문장들 써주기
		for(line = br.readLine(); line != null; line = br.readLine()) {
			ranking++;
			contents += ranking + line.substring(line.indexOf("\t")) +"\n";
		}
		
		br.close();
		
//		System.out.println(contents); 잘 출력하는지 확인하기 위함
		BufferedWriter bw = DBConnection.write();
		
		bw.write(contents); // DB에 저장하기 위함(여기선 txt) 날라갈수도있으니 38번째줄처럼 프린터해서 확인하는게 좋음
		
		bw.close();
	}
	
	// 제목으로 검색한 영화 정보 가져오는 메소드
	public ArrayList<MovieDTO> selectByTitle(String target) throws IOException{
		ArrayList<MovieDTO> list = new ArrayList<MovieDTO>();
		
		BufferedReader br = DBConnection.read();
		
		for(String line = br.readLine(); line != null; line = br.readLine()) {
			String[] temp = line.split("\t");
			if(temp[1].contains(target)) { //
				MovieDTO dto = new MovieDTO();
				dto.setRank(Integer.parseInt(temp[0]));
				dto.setTitle(temp[1]);
				dto.setDate(temp[2]);
				dto.setRevenue(temp[3]);
				dto.setView(temp[4]);
				dto.setScreen(temp[5]);
				list.add(dto); // 여기서 한 이유는 같은 이름의 영화가 있을 수 있으니 다 담아주는 것
			}
		}
		
		br.close();
		return list;
	}
	
	public ArrayList<MovieDTO> selectAll() throws IOException {
		// 영화 한 편에 대한 정보는 MoiveDTO에 담을 것임
		// 여러개의 영화 정보는 List에 담을 것이다.
		ArrayList<MovieDTO> list = new ArrayList<>();
				
		BufferedReader br = DBConnection.read();
		
		//읽어오기
		for(String line = br.readLine(); line != null; line = br.readLine()) {
//			line 에는 영화 한 편에 대한 6개의 값들이 들어있다.
//			1\t명량\t2014-07-30\t135,748,398,910\t17,613,682\t1,587
			String[] temp = line.split("\t"); // temp : {"1","명량","2014-07-30","135,748,398,910","17,613,682","1,587"}
			MovieDTO dto = new MovieDTO();
			dto.setRank(Integer.parseInt(temp[0])); // DTO에서 정의한건 1은 int 타입으로 정의했음.
			dto.setTitle(temp[1]);
			dto.setDate(temp[2]);
			dto.setRevenue(temp[3]);
			dto.setView(temp[4]);
			dto.setScreen(temp[5]);
			
			list.add(dto);
		}
		
		br.close();
		
//		다 읽고 반복이 끝났다면 list 안에는 모든 영화들의 정보가 들어있다.
		
		return list;
	}
	
}
