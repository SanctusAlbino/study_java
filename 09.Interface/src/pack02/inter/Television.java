package pack02.inter;

//추상 (Interface method) 메소드의 실제 구현은 상속(implements)받은 객체에서 한다.
public class Television implements RemoteControl {
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("티비 전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("티비 전원을 끕니다");
	}
	
	public void audio() {
		System.out.println("오디오만의 고유기능");
	}
	
	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if ( volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;//-1 => 0 , -100 => 0
		}else {
			this.volume = volume;			
		}
		System.out.println("현재 Tv 볼륨"+this.volume);
	}
	//인터페이스를 상속받아 구현한 Audio의 전체 메소드를 RemoteMain에서 전부 호출해보기
	
}
