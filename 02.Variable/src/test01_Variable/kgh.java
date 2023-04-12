package test01_Variable;

public class kgh {
	public static void main(String[] args) {
		//변수 : 어떤 값을 저장해놓기 위한것 (메모리)
		//변수는 타입이 있음 : 
		//1.숫자 - int(정수)<long(정수)
		//        float(실수)<double(실수)
		//변수 규칙:
		//1.선언: 변수타입 변수명 ;
		//2.할당: 변수명 = 변수타입에 담을수있는값;
		//3.초기화: ↑두가지를 한번에 하는것
		// 변수타입 변수명 = 값 ;
		int inum ;
		inum = 1 ;
		int inum1 = 10;
		System.out.println(inum1);
		long lnum ;
		lnum = 10L ;
		float fnum = 3.14F ;
		double dnum = 3.14 ;
		System.out.println(lnum);
		//왜 오류일까? : 초기화되지 않음, 값을 할당
		//initialized(초기화)
		System.out.println(fnum);
		System.out.println(dnum);
		
	}
}
