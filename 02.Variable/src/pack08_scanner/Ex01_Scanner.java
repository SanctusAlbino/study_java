package pack08_scanner;

import java.util.Scanner;

public class Ex01_Scanner {
	public static void main(String[] args) {
		// Scanner (입력)=> 자바 (출력)=> 콘솔창
		Scanner sc = new Scanner(System.in); //클래스의 초기화식 (5장)
		// 외부에서 들어오는 데이터를 사용해보기위해서 외워서 사용 O
		System.out.println("대기할껀지?");
		String inputData = sc.nextLine();
		System.out.println("여기가지 왔는지?");
		//외부에서 입력한 숫자는 String형태로 inputData라는 변수에 들어온다.
		//데이터에 +10을 한 결과를 출력해보세요.
		//inputData
		int sum = Integer.parseInt(inputData);
		System.out.println(sum+10);
	}
}
