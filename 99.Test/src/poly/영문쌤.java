package poly;

public class 영문쌤 implements 사람 {

	@Override
	public void 호흡() {
		System.out.println("영문쌤이 호흡한다.");
	}

	@Override
	public boolean 생사여부() {
		System.out.println("살아있다.");
		return true;
	}
	
	public void 코딩() {
		System.out.println("개발자이기때문에 기본구조에 + 코딩능력을 가지고있음");
	}

}
