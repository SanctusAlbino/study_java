package pack01.nasted;

import pack01.nasted.A.B;
import pack01.nasted.A.C;

public class Main {
	// 클래스의 중괄호 사이에 있는 모든것 --> ※멤버※: 인스턴스 멤버/ 스태틱 멤버 (static 여부)
	// 전역 변수: 클래스 내부에서 어디서든 사용가능함

	// 외부 클래스에서 다른 클래스 멤버에 접근 하는 방법 ↑
	// 인스턴스 멤버(static x): 인스턴스화 과정을 거쳐야만 접근이 가능(사용)
	// 스태틱 멤버(static o): 해당하는 클래스에 .찍어도 접근이 가능(사용)
	public static void main(String[] args) {
		// 인스턴스화 과정: 생성자 메소드를 이용하거나 값할당 등을 하여 null이 아닌 참조가 되는 상태로 만듬
		A a = new A(); // A클래스의 중괄호 사이의 모든것(접근제한자 차이 제외)을 사용할 수 있음
		System.out.println(a.aField);
		// B라는 클래스는 클래스가 맞지만, A의 인스턴스 멤버임
		B b = a.new B();
		System.out.println(b.bField);
		b.methodB();
		C c = new C();
		System.out.println(c.fieldC);
		System.out.println(a.methodA());

//		C c = new A.C();
//		C c2 = new C();
//		//a.new C();
	}

}
