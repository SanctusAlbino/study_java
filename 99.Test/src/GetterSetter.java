
public class GetterSetter {
	private int age; //GetterSetterMain이라는 클래스와 메인메소드를 만들고, 해당 클래스에서, -1과0이 입력안되게 만들어보기
					//Scanner sc = new Scanner(System.in)

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age<1) {
			System.out.println("잘못됨");
		}else {
		this.age = age;
		System.out.println("굿");
		}
	}
	
	//1.개발자끼리 봤을때 정확한 메소드의 기능을 판단하기 어려움
	//--> getter & setter라는 메소들 이름규칙을 정함.
	//getMethod: 필드의 값을 받아올때 씀
	//setMethod: 필드의 값을 넣을때 씀
	//2.다른 개발자는 메소드의 존재여부를 모르고 변수에 바로 접근해서 -값을 넣을 수있음
	//-->private
	
	
//	public void method(int num) {
//		if (num<1) {
//			System.out.println("놉");
//		}else {
//			System.out.println("굿");
//			age = num;
//			System.out.println(age);
//		}
//		
//	}
	
	
	
	
	
	
}
