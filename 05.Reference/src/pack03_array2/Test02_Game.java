package pack03_array2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test02_Game {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("랜덤한 숫자 맞추기 게임");
		System.out.println("난이도를 선택해주세요.");
		int level = Integer.parseInt(sc.nextLine());
		int [] gameArray = new int[level];
		String[] gameResult = new String[level];//[x] [x] []
		for(int i= 0; i<gameResult.length; i++) {
			gameResult[i]="?";
		}
		
		int random= new Random().nextInt(level);
		gameArray[random]=1;
		
		while(true) {
			System.out.println("1부터"+gameArray.length+"까지의 값을 입력!");
		
			for(int i= 0; i<gameResult.length; i++) {
				System.out.print(i+1+"["+gameResult[i]+"]");
			}System.out.println();
			
			int userNum = Integer.parseInt(sc.nextLine())-1;
			if(gameArray[userNum]==1) {
				System.out.println("정답");
				break;
			}else {
				gameResult[userNum]="X";
				System.out.println("땡");
			}
		}
	}
}
