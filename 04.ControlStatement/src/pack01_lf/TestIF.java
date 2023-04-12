package pack01_lf;

public class TestIF {
	public static void main(String[] args) {
		//1.int형 변수 code를 만든다. code의 값이 1,3이면 '남자' 2,4이면 '여자' 그외에는 오류
		
		int num = 2;
		if (num==1||num==3) {
			System.out.println("남자");
		}else if (num==2|| num==4) {
			System.out.println("여자");
		}else {
			System.out.println("오류");
		}
		
		//2.int random = (int)(Math.random() * 6) +1; <-해당 코드가 실행되고나면 1~^까지의 수가 랜덤하게 할당이됨
		// 조건문을 이용해서 random의 숫자가 몇인지를 출력하기.
		// 조건문을 꼭 이용해서 6개의 조건을 만들기.
		//ex) random(1) : 1이 출력이 되었습니다. .......~6까지 
		int random = (int)(Math.random() * 6) +1;
		
		if (random==1) {
			System.out.println("1이 출력되었습니다.");
		}
		if (random==2) {
			System.out.println("2이 출력되었습니다.");
		}
		if (random==3) {
			System.out.println("3이 출력되었습니다.");
		}
		if (random==4) {
			System.out.println("4이 출력되었습니다.");
		}
		if (random==5) {
			System.out.println("5이 출력되었습니다.");
		}
		if (random==6) {
			System.out.println("6이 출력되었습니다.");
		}
		
		// 여기는 진짜 심심하면 해보기.
		//3. 주사위 게임만들기
		//  (int) (Math.random() * 6 ) +1 <= 코드를 이용해서 첫번째로 나온숫자는 나의 숫자(사용자)
		//두번째로 나온 숫자는 컴퓨터의 숫자 입니다.
				
		// 누구의 주사위 수가 큰지 배틀하는 게임을 만드세요. 
		// 나 : 1 , 컴퓨터 : 6 => 결과 : 컴퓨터가 이겼습니다.
		
		int random1 = (int)(Math.random() * 6) +1;
		System.out.println(random1);
		int random2 = (int)(Math.random() * 6) +1;
		System.out.println(random2);
		if (random1>random2) {
			System.out.println("결과: 내가 이겼습니다.");
		}else if (random1<random2) {
			System.out.println("결과: 컴퓨터가 이겼습니다.");
		}else {
			System.out.println("무승부");
		}
	}
}
