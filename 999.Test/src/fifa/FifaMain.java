package fifa;

import java.util.Scanner;

public class FifaMain {
	public static void main(String[] args) {
		FifaDAO dao = new FifaDAO();
		Scanner sc = new Scanner(System.in);


		
		System.out.println("메뉴를 골라주세요.");
		System.out.println("1. 로그인 2. 회원가입 3. 종료");
		while (true) {
			String select = sc.nextLine();
			if (select.equals("1")) {
				dao.login();
				break;
			} else if(select.equals("2")) {
				dao.insertNewId();
				break;
			} else if(select.equals("3")) {
				System.out.println("종료합니다.");
				break;
			}else if (!(select.equals("1") || select.equals("2") || select.equals("3"))) {
				System.out.println("1~3중에 하나를 선택해주세요");
				continue;
			}
		}
		
		while (true) {
			System.out.println("원하시는 기능을 선택해주세요.");
			System.out.println("1. 전체 선수 조회 2. 선수 수정 3. 선수 삭제 4. 선수 검색 5. 선수 등록 6. 로그아웃");
			String choice = sc.nextLine();
			if (choice.equals("1")) {
				dao.selectAll();
			} else if (choice.equals("2")) {
				dao.UpdatetList();
			} else if(choice.equals("3")) {
				dao.deleteKOREA();
			} else if(choice.equals("4")) {
				dao.selectList();
			} else if(choice.equals("5")) {
				dao.insertKOREA();
			} else {
				System.out.println("로그아웃합니다.");
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
	}
}
