package pack03_for;

public class Ex02_For {
	public static void main(String[] args) {
		//제어문은 무한하게 중첩이 가능하다.
		//1. 0~9까지 10번 반복하는 반복문 안보고 만들어보기
		//2. 1부터 10까지 반복하는 반복문으로 수정해보기
		
		int sum=0;
		//1. 1부터 10까지의 누적합을 구하시오. 반복문 이용
		for (int i=1; i<=10; i++) {
			//짝수
//			if(i%2==0) {
//				System.out.println("짝수"+i);
	//		}else if(i%2==1) {
		//		System.out.println("홀수"+i);
		//	}
			sum+=i;
		
		}
		System.out.println(sum);
		
		
		
	}
}
