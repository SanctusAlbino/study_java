
public class Test06 {
	public static void main(String[] args) {
		int kor, mat, eng, mor, spo ;
		kor = 50;
		mat = 100;
		eng = 80;
		mor= 75;
		spo= 30;
		System.out.println(kor);
		System.out.println(mat);
		// ����ȯ(Casting) : ���� �ٸ� Ÿ���� ������ ��ȯ���� �����.
		// ex) int<-> double, String <-> int
		int ivalue = 10;
		double dvalue = ivalue+ 0.5;
		System.out.println("ivalue��:"+ ivalue);
		System.out.println("dvalue��:"+ dvalue);
		
		//�� ū ������Ÿ���� ���� Ÿ�Կ� ���� �� ������ �߻���
		//�����ڰ� � Ÿ������ �ٲܰ��� ��ø� ���༭ ������ �ٲ�.
		//�츮�� � �۾��� ��
		ivalue = (int)dvalue; //������ �߻���= �Ҽ��� ����
		System.out.println("ivalue��:"+ ivalue);
		System.out.println("dvalue��:"+ dvalue);
		
		String str = "1234"+12; // 123412
		//���ڿ��� � ���� ���ϴ� �� == ��x =>���� (������ ��ħ)
		int iData = 1234 + 12; // 1246
		// ������ �������� ���� == �� => ���� ��ħ
		System.out.println(str);
		System.out.println(iData);
		
		//str���� ���� 123412��� ���ڿ��� ����Ǿ�����.
		//���ڷ� �ٲٷ��� ��� �ؾ��ұ�?
		//123412�� ���� ���ڷ� �ٲٰ� +1�� ����� ����غ���
		int sum = Integer.parseInt(str)+1;
		System.out.println(sum);
		
		//boolean (�ο���) true �Ǵ� false�� ������ ������.
		
		String sum1 = "" +1234+5678+"�����ٶ�";
		System.out.println(sum1);
	}
}
