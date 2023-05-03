package pack01.thread;

public class Ex06_ThreadTest {
	//Ex06_YoutubeThread라는 작업을 하나 별도로 만듬->1초에 한번씩 동영상을 재생중입니다.
	//Ex06_MelonThread라는 작업을 하나 별도로 만듬-> 3초에 한번씩 음악을 재생중입니다.
	//ThreadTest에서는 YoutubeThread와, MelonThread를 각각 실행함.
	//두개의 기능이 각각 실행되게 처리
	public static void main(String[] args) {
//		Thread[] ThreadArr = new Thread[2];
//		ThreadArr[0] = new Ex06_YoutubeThread();
//		ThreadArr[1] = new Ex06_MelonThread();
//		
//		for (int i = 0; i < ThreadArr.length; i++) {
//			ThreadArr[i].start();
//		}
		Ex06_YoutubeThread yt = new Ex06_YoutubeThread();
		Ex06_MelonThread mt = new Ex06_MelonThread();
		yt.start();
		mt.start();
	}
	}
