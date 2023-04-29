package phone;

import java.util.Scanner;

public class Phone {
	Scanner sc = new Scanner(System.in);
	String color;
	String model;
	String state = "꺼짐";
	String power;
	String call;
	
	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	String powerOff() {
		setState("꺼짐");
		System.out.println("전원을 켜시려면 1번을 취소하시려면 0번을 입력해주세요.");
		while(true) {
			power = sc.nextLine();
			if (power.equals("0")) {
				System.out.println("취소");
				return power;
			}else if (power.equals("1")) {
				System.out.println("전원을 켭니다.");
				return power;
			}else {
				System.out.println("0,1 중에 입력해주세요.");
			}
		}
		
	}
	void calling() {
		setState("통화중");
		System.out.println("상대방의 번호를 입력해주세요.");
		call = sc.nextLine();
		
	}
	
	public void powerOn() {
		setState("켜짐");
	}
	
	
	
	
	
	
}
