package self_study;

import java.util.Scanner;

public class study03 {
//	-3.스캐너를 통해 입력받은 문자를 원하는 형태로 바꿔보기
//    3.1.스캐너를 통해 데이터 2건을 각각 입력 받는다.
//    3.2.콘솔창에 정수형 데이터 1~100사이의 값을 입력받은 뒤 입력 된 값을 정수형 변수 iData에 담고 출력
//    3.3.위 문제 해결 후 3.5를 콘솔에 입력 후 실수형 변수에 담고 출력
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("사용자가 입력한값"+sc.nextLine());
	System.out.println("1~100사이의 정수를 입력하시오.");
	int iDate = Integer.parseInt(sc.nextLine());
	System.out.println(iDate);
	double dDate = Double.parseDouble(sc.nextLine());
	System.out.println(dDate);
	
	}
}
