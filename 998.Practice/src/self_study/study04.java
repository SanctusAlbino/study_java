package self_study;

import java.util.Scanner;

public class study04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요.");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.println(num1);
		System.out.println("두번째 숫자를 입력하세요.");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.println(num2);
		
		System.out.println(num1==num2 ? "같다": num1<num2 ?"넘1작다": "num2 big");
		
		
		
		
	}
}
