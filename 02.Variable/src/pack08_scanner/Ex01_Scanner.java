package pack08_scanner;

import java.util.Scanner;

public class Ex01_Scanner {
	public static void main(String[] args) {
		// Scanner (�Է�)=> �ڹ� (���)=> �ܼ�â
		Scanner sc = new Scanner(System.in); //Ŭ������ �ʱ�ȭ�� (5��)
		// �ܺο��� ������ �����͸� ����غ������ؼ� �ܿ��� ��� O
		System.out.println("����Ҳ���?");
		String inputData = sc.nextLine();
		System.out.println("���Ⱑ�� �Դ���?");
		//�ܺο��� �Է��� ���ڴ� String���·� inputData��� ������ ���´�.
		//�����Ϳ� +10�� �� ����� ����غ�����.
		//inputData
		int sum = Integer.parseInt(inputData);
		System.out.println(sum+10);
	}
}
