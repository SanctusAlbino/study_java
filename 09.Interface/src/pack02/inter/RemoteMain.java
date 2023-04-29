package pack02.inter;

public class RemoteMain {
	public static void main(String[] args) {
		Audio a = new Audio();
		a.turnOn();
		a.setVolume(100); //인터페이스 부분을 이용해서 audio의 최소 볼륨과 최대 볼륨을 기입해주면 좋음
		a.turnOff();
		
		Television tv = new Television();
		tv.turnOn();
		tv.turnOff();
		tv.setVolume(100);
		//다향성: 인터페이스를 상속받은 객체 Audio& Television은 공통적으로 턴온 턴오프 셑볼륨을 가지고 있음
		//따라서 RemoteCotrol(Interface)==Audio == Television
		RemoteControl[]rcArr = new RemoteControl[2];
		rcArr[0] = new Television();
		rcArr[1] = new Audio();
		for (int i = 0; i < rcArr.length; i++) {
			rcArr[i].turnOn();
		}
	}
}
