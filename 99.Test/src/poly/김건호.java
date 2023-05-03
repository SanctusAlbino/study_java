package poly;

public class 김건호 implements 사람 {

	@Override
	public void 호흡() {
		System.out.println("숨쉰다.");
		
	}

	@Override
	public boolean 생사여부() {
		System.out.println("살고있다.");
		return true;
	}
	public void 공부() {
		System.out.println("공부합니다.");
	}
}
