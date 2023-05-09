package pack01.list;

public class BoardDTO { //데이터베이스의 한행
	private int number;
	private String name, content ;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public BoardDTO(int number, String name, String content) {
		this.number = number;
		this.name = name;
		this.content = content;
	}

	
	
}
