package self_study02;

import java.util.Scanner;

public class study01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		if(num==1||num==3) {
			System.out.println("남자입니다.");
		}else if (num==2||num==4) {
			System.out.println("여자입니다.");
		}else {
			System.out.println("오류");
		}
	}
}
