package pack08_casting;

public class Ex02_Casting {
	public static void main(String[] args) {
		//���ڿ� = "12" + 34 = 1234
		//Sting + int = String
		//why? ���ڿ� + ��� = ���ڿ� ��Ģ
		// ���ڿ� ������ ��Ģ
		// "1"(String) �ٸ��� 1(����)
		String sum = "12" + 34;
		//� ���� String���� �ٲٴ� ���� ��û���� �����ϴ�.
		String sum2 = "" + 1234 ;
		
		// String sum , sum2 ������ ���ڿ��� ���ڸ� �����ص�.
		// �ΰ��� ���� �˰�ʹ�. "1234" + "1234"
		// sum + sum2 = 12341234
		// ���� 1234 + 1234 = 2468�� ����� ���� �Ѵ�.
		// String => int?
		// int, double ���� ��������� �۾� �ٲ�°� => �⺻Ÿ��
		// �빮�ڷ� �����ϴ� �͵��� ��κ� Class Ÿ��
		// �⺻ ������ Ÿ���� Wrapper class��� ���� ������ �ִ�.
		// int => Interger, double Double
		// String�� �ش��ϴ� Ÿ������ �ٲ��ִ� ������ �Ѵ� �� 
		// String�� �ִ� ""<= �����Ѵ�.
		int num = Integer.parseInt(sum);
		// num2�� sum2�� ���ڷ� �ٲ㼭 �־��
		int num2 = Integer.parseInt(sum2); //"1234"
		System.out.println(num+num2);
		String sAvg = "88.6";
		//���� +10�� �� ����� ������. (98.6)
		//  sAvg <= double���·� �ٲٴ°� �غ���
		double dAvg = Double.parseDouble(sAvg) + 10;
		System.out.println(dAvg);
		//WrapperClass.parseDataType(string); => DataType
		String str = "123";
		//���� �ش� �����͸� ���ڷ� �ٲ� �� ������? wrapperClass�̿�
		double dValue = Double.parseDouble(str);
		System.out.println(dValue);
		//Float.parseFloat(sAvg)
		//Long.parseLong(sAvg)
		//Byte.parseByte(sAvg)
		
	}
}
