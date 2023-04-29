package pack02.inter;

public interface RemoteControl {
	//Audio, Tv 공통된 기능을 무조건 구현하게 만들예정
	//전원을 켜고 끄는것
	//볼륨을 조절하는것
	int MIN_VOLUME=0;
	int MAX_VOLUME =10;
	//추상메소드
	void turnOn();

	void turnOff();
	
	void setVolume(int volume);
	
	
}
