package pack03_for;

import java.util.Scanner;

public class Test01_For {
	public static void main(String[] args) {
		// print와 println을 적절히 사용하여.// 다중 for문을 이용해서 별찍기
		// ★
		// ★★
		// ★★★
		// ★★★★
		// ★★★★★
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		// 응용문제 Scanner를 이용해서 숫자를 입력 받는다. // 입력 받은 숫자까지의 구구단을 출력하는 for문을 만들어보기
		// 2미만의 숫자를 입력하면 구구단을 출력x => 잘못된숫자 라고 콘솔창에 출력만함.// 2이상의 숫자가 입력 되면 해당하는 단까지의 구구단을 출력하기.
		Scanner sc = new Scanner(System.in);
		String inputData = sc.nextLine();
		int num = Integer.parseInt(inputData);
		if (num < 2) {
			System.out.println("잘못된 숫자");
		}
		for (int i = 2; i <= num; i++) {
			System.out.println(i + "*" + 1 + "=" + (i * 1));
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "X" + j + "=" + (i * j) + "	");
			}
			System.out.println();
		}

	}
}
