package pack01.thread;

import java.awt.Toolkit;

public class Ex03_BeepThread {
	public static void main(String[] args) {
		//기존에는 Runnable을 상속받은 BeepTask라는 Class를 만들고 해당하는 Class를 이용해서
		//Thread를 생성하여 사용하였음
		//이번에는 interface타입을 파라메터로 넘겨서 사용하는 방법을 사용해보기
		Runnable run =new Runnable() {
			
			
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					toolkit.beep();//절대 외우거나 공부x, 이번장 책 예제에 있기 때문에 사용함
					System.out.println("띠로롱");
					//메인쓰레드가 계속해서 작업을 하는게 아니라, 몇초정도의 휴지시간(멈춤)을 가지고 
					//동작하게 처리
					try {
						Thread.sleep(1*1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			
			
				//runnable을 interface인데 interface내부에 있는 메소든는 객체가 생성될때 반드시 
				//구현이 되어야 한다. 따라서 메소드가 있어야할 익명의 지역을 만들고 run메소드가 
				//반드시 구현된 형태로 객체생성이 된다.
			}
		};
		
		Thread thread = new Thread(run);
		thread.start();
	}
}
