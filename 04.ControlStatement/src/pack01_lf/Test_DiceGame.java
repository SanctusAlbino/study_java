package pack01_lf;

import java.util.Scanner;

public class Test_DiceGame {
	public static void main(String[] args) {
		//사용자가 어떤 동작을 했을 때 게임이 진행된는것
		//나 vs 컴퓨터
		System.out.println("주사위 게임을 시작합니다.");
		System.out.println("-1을 입력하면 종료합니다. 그외에는 시작");
		Scanner sc=new Scanner(System.in);
		String inputData = sc.nextLine();
		int num = Integer.parseInt(inputData);
		if (num==-1) {
			System.out.println("종료합니다.");
		} else {
			System.out.println("게임시작.");
			System.out.println("사용자가 주사위를 굴릴 차례입니다. (굴리기 Enter)");
			sc.nextLine();
			int userNum = (int)(Math.random() * 6) +1;
			System.out.println("사용자의 수" + userNum);
			System.out.println("컴퓨터가 주사위를 굴립니다. (진행 Enter)");
			sc.nextLine();
			int comNum = (int)(Math.random() * 5) +1;
			System.out.println("컴퓨터의 수"+comNum);
			if (userNum>comNum) {
				System.out.println("결과: 내가 이겼습니다.");
			}else if (userNum<comNum) {
				System.out.println("결과: 컴퓨터가 이겼습니다.");
			}else {
				System.out.println("무승부");
			}
		}
	}
}
