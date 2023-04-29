package pack04.extend;

public class SmartPhone extends DmbPhone {
	public SmartPhone(int channel, String color, String model, int internet) {
		//DmbPhone dmb = new DmbPhone(param....)
		super(channel, color, model);//부모 클래스가 별도의 생성자 메소드를 가지고 있다면 
									// 해당하는 부모 클래스가 인스턴스화 되어야지만, 자식 객체도 생성이 가능하다.
		this.internet =internet;
	}
	int internet ;
	void useInternet () {
		System.out.println("인터넷을 사용한다.");
	}
}
