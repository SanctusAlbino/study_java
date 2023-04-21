package pack03_constructor;

public class Test01 {
	//1. 이름, 아이디, 패스워드, 나이를 필드로 사용하는 Member클래스를 생성후Member클래스 필드값에
	//값을 할당하고 출력해보기
	
	//2.이름, 아이디, 패스워드, 나이를 필드로 사용하는 MemberDTO클래스를 생성한다.
	//필수로 입력이 되어야 할것같은 필드는 생성자를 통해서 입력을 받게 만들고
	//해당 내용을 출력한다.
	
	String name="";
	String id= "";
	int pw= 1234;
	int ord= 26;
	
	
	
	public Test01(String name, String id, int pw, int ord) {
		super();
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.ord = ord;
	}
	
	
	
}
