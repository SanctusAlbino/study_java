package pack02_byte;

public class Ex01_Byte {
	public static void main(String[] args) {
		// {} <-- main ����
		// byte Ÿ���� ������ �����غ��� var1
		// byte Ÿ���� ���� var1�� �� 0�� �Ҵ��غ���
		// byte Ÿ���� ���� var2�� 10�� �ְ� �ʱ�ȭ �غ���
		byte var1 ;
		byte var2 = 10 ;
		// byte�� ���� �� 8���� ��Ʈ��� �����Ǿ�����.
		// bit 0�Ǵ� 1 �ΰ��������� ǥ���� �� �ִ�
		// �ּ����� ���� ǥ�� ���� �Դϴ�.
		// -128 ~ 127 ǥ�� ����
		//�� ������ ǥ�� ������ ������ ������ �ش��ϴ� ���� �ȿ��� ��� �ؤ�
		var1 = -128 ;
		var2 = 127 ;
		System.out.println(var1);
		System.out.println(var2);
		
	}
}
