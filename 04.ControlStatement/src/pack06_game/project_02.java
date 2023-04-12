package pack06_game;

import java.util.Scanner;

public class project_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor,eng,mat;
		while (true) {
			System.out.println("국어점수를 입력하세요");
			kor = Integer.parseInt(sc.nextLine());
			if (kor>100||kor<0) {
				System.out.println("다시입력하세요");
				continue;
			}break;
		}
		while (true) {
			System.out.println("영어점수를 입력하세요");
			eng = Integer.parseInt(sc.nextLine());
			if (eng>100||eng<0) {
				System.out.println("다시입력하세요");
				continue;
			}break;
		}
		while (true){
			System.out.println("수학점수를 입력하세요");
			mat = Integer.parseInt(sc.nextLine());
			if (mat>100||mat<0) {
				System.out.println("다시입력하세요");
				continue;
			}break;
		}
		System.out.println("총합="+(kor+eng+mat));
		System.out.println("평균="+(kor+eng+mat)/3);
				
			
			
		
			
		
		
			
		
		
		
	}
}
