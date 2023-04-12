package pack06_game;

import java.util.Random;
import java.util.Scanner;

public class project_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int random = new Random().nextInt(100)+1; // 1~100까지의 수 채변
		int i = 0;
		while(true) {
			System.out.println("1부터 100사이의 정수를 입력하세요.");
			int userNum = Integer.parseInt(sc.nextLine());
			i++;
			if (userNum>random) {
				System.out.println("더 작은 수를 입력하세요");
			} else if (userNum<random) {
				System.out.println("더 큰 수를 입력하세요.");	
			} else {
				System.out.println("맞췄습니다.");
				System.out.println(i+"번만에 맞췄습니다.");
				break;
				}
		}

	}
	
}
