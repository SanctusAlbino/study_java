package pack01_variable;

public class Ex03_Variable {
	public static void main(String[] args) {
		int value = 0 ; //초기화되지 않은 변수는 사용이 불가능.
		int result = value + 10;
		System.out.println(result);
		//숫자형 변수들은 사칙연산이 가능하다.
		//재할당. (변수를 계속 만드는게 아니라 값을 다시 줘서 바꿈)
		result = 1+1+10;
		// result에 나머지 사칙연산의 결과를 저장하고 각각 출력해보기
		System.out.println(result);
		result = 2*10;
		System.out.println(result);
		result = 10 / 5;
		System.out.println(result);
	}
}
