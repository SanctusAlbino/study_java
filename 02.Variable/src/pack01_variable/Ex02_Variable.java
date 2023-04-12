package pack01_variable;

public class Ex02_Variable {
// int타입을 가진 변수 a를 선언하기
// int타입을 가진 변수 b를 선언하기
// int타입을 가진 변수 b에 값 30을 할당하기
	public static void main(String[] args) {
		int a ;// 이클립스는 오류코드 외에도 메모리를 생각해서
			   // 불필요한 변수는 지우라고 추천을 한다.(노랑)
		int b ;
		b = 30 ;
		int c =40 ;
		System.out.println(b);
		System.out.println(c);
		// 현 a, b, c 쓰고있음 => 문제점?
		// 같이 협업을 할때 이변수자체를 왜 만들었는지 모름
		// 변수명 (식별자) 작성 규칙
		// -반드시 알파벳 소문자로 시작!
		// -자바에서 미리 쓰고있는 예약어는 사용불가능
		// -띄어쓰기 X
		// -글자수에 제한이 없음 다만 어떤 내용의 변수인지를 
		// 알아볼 수있는 단어가 좋다.(단어 연결도 가능)
		// class(.java)를 만들때는 대문자로 시작
		int num = 10 ;
		
	}
}
