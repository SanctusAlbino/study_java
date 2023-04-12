
public class EX04_Operator {
	public static void main(String[] args) {
		//사칙연산 + 나머지
		int value1 = 5, value2 = 2;
		// 두변수의 사칙연산결과를 출력해보기 ex) 출력결과 : value1+value2 =7 ..
		System.out.println("value1 + value2=" + (value1 + value2));
		System.out.println("value1 - value2=" + (value1 - value2));
		//String-int 가 불가능하기 때문에 소괄호로 연산 우선순위를 준다.
		//연산 순서때문에 오류가 발생x 습관적으로 연산식과 String이 더해질때는 따로 감싸주기
		System.out.println("value1 * value2=" + (value1 * value2));
		System.out.println("value1 / value2=" + (value1 / value2));
		
		System.out.println("나머지는 %로 구한다." + (value1 % value2));
	}
}
