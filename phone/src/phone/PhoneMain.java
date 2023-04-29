package phone;

import java.util.Scanner;

public class PhoneMain {
	public static void main(String[] args) {
		Phone ph = new Phone();
		Scanner sc = new Scanner(System.in);
		String powerSel;
		System.out.println("0번을 누르면 취소");
		System.out.println("1번을 입력하면 1세대폰 결정");
		System.out.println("2번을 입력하면 dmb폰 결정");
		System.out.println("3번을 입력하면 smart폰 결정");
		while (true) {
			String select = sc.nextLine();
			if (select.equals("0")) {
				System.out.println("취소합니다.");
				break;
			} else if (!(select.equals("1") || select.equals("2") || select.equals("3"))) {
				System.out.println("0~3중에 하나를 선택해주세요");
				continue;
			}
			System.out.println("원하는 색상을 입력해주세요");
			String color = sc.nextLine();
			System.out.println("원하시는 모델을 입력해주세요.");
			String model = sc.nextLine();
			System.out.println("세대: " + select + " 색상: " + color + ", 모델: " + model + ", 상태: " + ph.state);

			if (select.equals("1")) {
				while (true) {
					powerSel = ph.powerOff();
					if (powerSel.equals("0")) {
						break;
					} else if (powerSel.equals("1")) {
						ph.powerOn();
						break;
					} else {
						System.out.println("0,1 중에 입력해주세요.");
					}
				}
				if (ph.getState().equals("켜짐")) {
					while (true) {
						System.out.println("전원을 끄시려면 3번을 전화기능을 사용하시려면 4번을 눌러주세요");
						String pc = sc.nextLine();
						if (pc.equals("3")) {
							ph.powerOff();
							if(ph.power.equals("0")) {
								break;
							}
						} else if (pc.equals("4")) {
							ph.calling();
							
							
						}else {
							System.out.println("0,1번 중에 입력해주세요.");
						}
					}
				}else {
					System.out.println("ㅁㄴㅇㅁㄴㅇㅁㄴㅇㄴㅁㅇ");
					break;
				}

			
				
				
				
				
				
				
				
				
				
				
				
				} else if (select.equals("2")) {

			} else if (select.equals("3")) {

			}
			break;
		}

	}
}