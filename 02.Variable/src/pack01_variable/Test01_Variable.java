package pack01_variable;

public class Test01_Variable {
// int num1, int num2
// 각각의 변수에는 숫자 1과 2가 담아져있음.
// 값의 재할당 X, 두개의 숫자를 바꿔보기.
// 수단과 방법은 다 사용 가능하나, num1=2 사용 X
// 초기 : num1(1) , num2(2)
	public static void main(String[] args) {
		int num1 = 1 ;
		int num2 = 2 ;
		int temp = 0 ;
		
		temp = num1 ; 
		num1 = num2 ;
		num2 = temp ;
		System.out.println(num1);
		System.out.println(num2);
		
	}
}
