package pack03_Decimal;

public class Ex01_Decimal {
	public static void main(String[] args) {
		int i = 1234567890;
		System.out.println(i);
		//int �̻��� ���� ���� �� �ִ� ������ ������Ÿ���� ������.
		//long�� l1�̶�� ������ �����ϱ�.
		//long�� l2��� ������ �ʱ�ȭ ��Ű��. 12345678901
		long l1 ;
		long l2 = 12345678901L; // ���� +longŸ���̶�� ���д�
		System.out.println(l2);
		
		//�Ǽ��� ������ Ÿ�� : float, double
		//�Ǽ����� �Ҽ����� �ִ°��� ǥ���ϱ� ���� ����
		//float�� long�� ���������� ������ F�� �ٿ���߸���.
		
		float f1 ;
		f1 = 1.1F ;
		float f2 = 3.144F ;
		System.out.println(f2);
		
		double d1 ;
		double d2 = 3.1 ;
		System.out.println(d2);
		
	}
}
