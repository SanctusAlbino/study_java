package pack06_game;

import java.util.Scanner;

public class Test02_ScorePg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor= -1, eng= -1, mat= -1;
		System.out.println("국어점수를 입력하세요");
		while (kor==-1) { //초기에 -1로 값을 초기화 해놨기 때문에 초기화만 된 상태에서는 계속해서 반복
			kor = Integer.parseInt(sc.nextLine());
			if(kor>0&&kor<=100) {
				System.out.println("국어 성적 입력 완료");
			}else {
				System.out.println("잘못입력 1~100까지 가능");
				kor= -1;
			}
		}
		System.out.println("영어점수를 입력하세요");
		while (eng==-1) { //초기에 -1로 값을 초기화 해놨기 때문에 초기화만 된 상태에서는 계속해서 반복
			eng = Integer.parseInt(sc.nextLine());
			if(eng>0&&eng<=100) {
				System.out.println("영어 성적 입력 완료");
			}else {
				System.out.println("잘못입력 1~100까지 가능");
				eng= -1;
			}
		}
		System.out.println("수학점수를 입력하세요");
		while (mat==-1) { //초기에 -1로 값을 초기화 해놨기 때문에 초기화만 된 상태에서는 계속해서 반복
			mat = Integer.parseInt(sc.nextLine());
			if(mat>0&&mat<=100) {
				System.out.println("수학 성적 입력 완료");
			}else {
				System.out.println("잘못입력 1~100까지 가능");
				mat= -1;
			}
		}
		System.out.println("국어"+kor);
		System.out.println("영어"+eng);
		System.out.println("수학"+mat);
	}
}
