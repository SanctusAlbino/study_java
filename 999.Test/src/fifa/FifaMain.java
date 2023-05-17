package fifa;

import java.util.Scanner;

public class FifaMain {
	public static void main(String[] args) {
		FifaDAO dao = new FifaDAO();
		Scanner sc = new Scanner(System.in);


		
		while (true) {
			System.out.println("메뉴를 골라주세요.");
			System.out.println("1. 로그인 2. 회원가입 3. 종료");
			String select = sc.nextLine();
			if (select.equals("1")) {
				dao.login();
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
			} else if(select.equals("2")) {
				while(true) { 
				dao.insertNewId();
				
				}
			} else if(select.equals("3")) {
				System.out.println("종료합니다.");
				break;
			}else if (!(select.equals("1") || select.equals("2") || select.equals("3"))) {
				System.out.println("1~3중에 하나를 선택해주세요");
				continue;
			}
		}
		
		
		//====================================================================
		
		
			
			System.out.println("1.내선수 검색\n2.스쿼드\n3.상점\n4.보유BP\n5.로그아웃");
			else if(select==3) {
				System.out.println("1.선수구매 2.선수판매");
				select = dao.inputInt();
				if(select==1) {
					dao.list();
					dao.buyPlayer();
				}else if(select==2) {
					dao.mylist();
					dao.sellPlayer();
				}
			}else if(select==4) {
				while(true) {
				System.out.println("===== 나의 보유BP =====");
				dao.myBP();
				System.out.println("\n1.충전하기 2.메뉴로 돌아가기");
				select = dao.inputInt();
				if(select==1) {
					System.out.println("충전할 금액을 입력해주세요.");
					dao.plusBP();
				}else if(select==2) {
					break;
				}
				}
			}
			
		
		
		
		
		
		
		
		
		
		
	}
}
