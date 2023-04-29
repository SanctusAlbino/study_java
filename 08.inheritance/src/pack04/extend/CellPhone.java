package pack04.extend;

public class CellPhone {
	//1세대 폰: 전원을 켜고 끄는 기능과, 통화기능이 있는 휴대폰
	String model;
	String color;
	final String CHIP = "칩"; //final이라는 것은 처음에 값 할당 이후에는 절대 수정 불가 (최종)
							//상수라고도 표현하는데 변수의 이름을 지을때는 반드시 전체 대문자로 해준다. (개발자끼리 알아보기위함)
	
	
	private void changeFolder() {
		System.out.println("1세대 폰의 모델 특성상 화면이 돌아가는 기능입니다.");
	}
	//return이 없는 메소드
	//powerOn: syso로 전원을 켭니다 출력
	//powerOff: syso로 전원을 끕니다 출력
	//bell : syso로 벨이 울립니다가 출력
	//sendVoice: String값을 입력받아 나:String값을 syso로 출력하는 메소드
	//receiveVoice: 상다방: String값 출력
	//hangUp: 전화를 끊습니다가 출력
	
	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	public void bell() {
		System.out.println("벨이 울립니다.");
	}
	public void sendVoice(String sv) {
		System.out.println("나: "+ sv);
	}
	public void receiveVoice(String rv) {
		System.out.println("상대방: "+rv);
	}
	public void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}
