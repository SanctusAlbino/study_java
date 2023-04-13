package pack02_trycatch;

import java.util.Random;
import java.util.Scanner;

public class Test01_TryCatch {
	public static void main(String[] args) {
		// 배열의 랜덤한 공간에 숫자 숨기기 게임.
		// 기존로직은 그대로 사용하면 됨.
		// 단, 사용자의 입력은 자유로운데 잘못입력시 "잘못입력입니다. 숫자범위 ?~?까지만 입력해주세요"
		// 가 나오고 프로그램은 강제로 종료되는 경우가 없다.(게임 끝까지)

		Scanner sc = new Scanner(System.in);
		String inputData1 = sc.nextLine();
		int num1 = Integer.parseInt(inputData1);
		int[] array = new int[0];
		System.out.println(array.length);

		while (array.length < 2) {
			try {
				System.out.println("게임의 난이도: " + num1);
				array = new int[num1];
			} catch (Exception e) {
				System.out.println("숫자 오류 2이상의 숫자 입력");
				num1 = Integer.parseInt(sc.nextLine());
			}
		}

		int random = new Random().nextInt(array.length + 1);

		for (;;) {
			System.out.println("숫자를 입력하세요. ");
			int num2 = Integer.parseInt(sc.nextLine());
			if (num2 == random) {
				System.out.println("정답");
				break;
			} else {
				System.out.println("오답");
			}
		}

	}
}
