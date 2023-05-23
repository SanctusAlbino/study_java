package self_study02;

import java.util.Scanner;

public class study02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id = sc.nextLine();
		System.out.println("유저아이디를 입력하세요"+id);
		String pw = sc.nextLine();
		System.out.println("유저비밀번호를 입력하세요"+pw);
		System.out.println("로그인중입니다.");
		if ("admin".equals(id)&&"1234".equals(pw)) {
			System.out.println("환영합니다.");
		}else {
			System.out.println("아이디 혹은 비밀번호를 입력해주세요.");
		}
	}
}
