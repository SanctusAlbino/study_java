package pack01_variable;

public class Test01_Variable {
// int num1, int num2
// ������ �������� ���� 1�� 2�� ���������.
// ���� ���Ҵ� X, �ΰ��� ���ڸ� �ٲ㺸��.
// ���ܰ� ����� �� ��� �����ϳ�, num1=2 ��� X
// �ʱ� : num1(1) , num2(2)
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
