
public class Member {
	public Member(int field) {//메소드의 중괄호가 끝나면 내부에 있는 모든 내용은 메모리에서 사라짐.
		System.out.println(field); //파라메터 또는 지역변수......
		System.out.println(this.field); //나 자신 (this).field
	}
	
	//블럭킹 : 지역의 시작과 끝, 내부에 들어있는 모든 것들을 멤버
	//static 여부
	int field =1; //인스턴스 멤버
	static int sField = 2;// 스태틱 멤버
	//클래스 사이에 있으면 전부 멤버!
	
	//인스턴스화: 클래스가 가지고 있는 멤버중에 인스턴스 멤버들을 메모리에 올려서 사용가능하게 하는 과정 
	//	(인스턴스화 과정이 끝나고나서는 전체 멤버가 사용 가능함, 외부에서 private)
	//생성자(constructor) 메소드: 클래스가 메모리에 올라갈때 사용할 생성식 == 클래스와 이름이 대소문자가 정확히 같음.
	public static void main(String[] args) {
		//멤버에클래스에 점 찍어서 나오면 스태틱
		//인스턴스화 거치면 ......
		Member mm = new Member(10); //인스턴스화 과정: new 'Member();' 생성자 메소드
		System.out.println(sField);
	}
}
