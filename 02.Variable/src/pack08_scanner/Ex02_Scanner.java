package pack08_scanner;

import java.util.Scanner;

public class Ex02_Scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String data1 = sc.nextLine();//���� ����Ű ġ���������� ���ڿ��� ������.
		// ���ڸ� �ΰ� �޾ƿͼ� �� ���� ���� ���ϱ�
		String data2 = sc.nextLine();
		int sum1 = Integer.parseInt(data1);
		int sum2 = Integer.parseInt(data2);
		System.out.println(sum1+sum2);
		// 1. int sum = Integer.parseInt(data1) + int sum = Integer.parseInt(data1);
		// System.out.println(Integer.parseInt(data1) + int sum = Integer.parseInt(data1));
	}
}