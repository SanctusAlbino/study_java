
public class Ex07_OPer {
	public static void main(String[] args) {
		// =( 대입 , 값 할당)
		// 비교 연산자 (=, <, >,<=,>=
		// 초과, 미만 : 0,1,2,3
		// 조건식에 포함된 숫자를 뺀다. => 1~3
		// 이상, 이하 : 0,1,2,3,4
		// 조건식에 포함된숫자를 포함. => 1~4
		int num = 10;
		String result = num == 10 ? "맞다" : "틀리다";
		// 숫자가 10이면 1을 그리고 아니라면 2를 담는 이항연산자 써보기
		int resultInt = num == 10 ? 1 : 2;
		System.out.println(result + resultInt);
		// num에 있는 수가 9이하라면 true 그외에는 false를 담을수있는 식을 완성해보기
		int num1 = 9;
		boolean result1 = num1 <= 9 ? true : false;
		System.out.println(!result1);
	}
}
