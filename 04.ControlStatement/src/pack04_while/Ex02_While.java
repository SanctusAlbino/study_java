package pack04_while;

public class Ex02_While {
	public static void main(String[] args) {
		// for문 : 반복 횟수를 정확하게 알때 수에 의해서 반복시키는 경우
		// while문 : 반복 횟수를 정확하게 모를때 조건에 의해서 반복시키는 경우
		int i =1;
		int result = 0;
		while (i<=10) {
			System.out.println(i);
			result += i;
			i++;
		}
		System.out.println(result);
		
		
		
		
		
		
	}
}
