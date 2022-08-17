package view;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import dao.MovieDAO;
import dto.MovieDTO;

// 콘솔창 화면을 구현할 부분
public class View {
	public static void main(String[] args) throws IOException{ // 원래 안떠넘김 트라이캐치하면 복잡해져서 일단 작업할려고 떠넘김.
		Scanner sc = new Scanner(System.in);
		MovieDAO dao = new MovieDAO();
		
		while(true) {
			System.out.println("1. 영화정보 추가하기");
			System.out.println("2. 영화정보 수정하기");
			System.out.println("3. 영화정보 검색하기");
			System.out.println("4. 영화정보 삭제하기");
			System.out.println("5. 모든 영화정보 보기");
			System.out.println("6. 종료하기");
			System.out.print("입력 >> ");
			int choice = Integer.parseInt(sc.nextLine());
			
			if(choice == 1) {
				System.out.print("영화제목 >> ");
				String title = sc.nextLine();
				System.out.print("개봉일 >> ");
				String date = sc.nextLine();
				System.out.print("영화매출액 >> ");
				String revenue = sc.nextLine();
				System.out.print("영화관객수 >> ");
				int view = Integer.parseInt(sc.nextLine()); // 적고 순위에 맞춰서 넣어주기 위함
				System.out.print("영화상영관수 >> ");
				String screen = sc.nextLine();
				
				dao.add(title, date, revenue, view, screen);
				
			}else if(choice == 2) {
				System.out.print("영화 랭킹 >> ");
				int rank = Integer.parseInt(sc.nextLine());
				
				System.out.print("수정 제목 >> ");
				String title = sc.nextLine();
				
				System.out.print("수정 개봉일 >> ");
				String date = sc.nextLine();
				
				System.out.print("수정 매출액 >> ");
				String revenus = sc.nextLine();
				
				System.out.print("수정 관객수 >> ");
				int view = Integer.parseInt(sc.nextLine());
				
				System.out.print("수정 상영관수 >> ");
				String screen = sc.nextLine();
				
				dao.update(rank,  title,  date, revenus, view, screen);
				
			}else if(choice == 3) {
				// 영화제목으로 검색하기
				System.out.print("검색할 제목 >> ");
				String target = sc.nextLine();
				ArrayList<MovieDTO> list = dao.selectByTitle(target);
				
				if(list.size() == 0 ) {
					System.out.println("검색결과가 없습니다");
					continue;
				}
				System.out.println("---"+ target +"검색 결과---");
				for ( MovieDTO dto : list) {
					System.out.println("-["+ dto.getRank()+"위]:"+dto.getTitle()+"-----");
					System.out.println("|개봉일: "+dto.getDate());
					System.out.println("|관객수: "+dto.getView());
					System.out.println("|매출액: "+dto.getRevenue());
					System.out.println("|상영관수: "+dto.getScreen());
				}
				
			}else if(choice == 4) {
				System.out.print("삭제할 영화 랭킹 >> ");
				int rank = Integer.parseInt(sc.nextLine());
				
				if(dao.remove(rank)) {
					System.out.println("삭제 성공");
				}else {
					System.out.println("삭제 실패");
				}
			}else if(choice == 5) {
				ArrayList<MovieDTO> list = dao.selectAll();
				System.out.println("---모든 영화 정보---");
				for( MovieDTO a  : list) {
					System.out.println("-["+ a.getRank()+"위]:"+a.getTitle()+"-----");
					System.out.println("|개봉일: "+a.getDate());
					System.out.println("|관객수: "+a.getView());
					System.out.println("|매출액: "+a.getRevenue());
					System.out.println("|상영관수: "+a.getScreen());
				}
			}else if(choice == 6) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("잘못입력했습니다.");
			}
			System.out.println();
		}
	}
}
