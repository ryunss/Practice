package dto;

public class MovieDTO {
	int rank; // 순위 저장할 변수
	private String title; // 영화제목 저장할 변수
	private String date; // 개봉일 저장할 변수
	private String revenue; // 매출액 저장할 변수
	private String view; // 관객수 저장할 변수
	private String screen; // 상영관수 저장할 변수
	
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getRevenue() {
		return revenue;
	}
	public void setRevenue(String revenue) {
		this.revenue = revenue;
	}
	public String getView() {
		return view;
	}
	public void setView(String view) {
		this.view = view;
	}
	public String getScreen() {
		return screen;
	}
	public void setScreen(String screen) {
		this.screen = screen;
	}
	
}
