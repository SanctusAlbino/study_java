package pack04_while;

import java.util.Scanner;

public class Test02_While {
	public static void main(String[] args) {
		//1. 별찍기
		
//		int i= 1;
//		while(i<=5) {
//			int j=1;
//			while(j<=i) {
//				System.out.print(j);
//				j++;
//			}System.out.println();
//			i++;
//		}	
		//2. 사용자가 입력한 수 만큼의 구구단 출력 
		//2미만의 숫자는 오류라고 출력, 그 외에는 해당하는 숫자만큼 구구단 출력
		Scanner sc =new Scanner(System.in);
		String inputData = sc.nextLine();
		int num = Integer.parseInt(inputData);
		if (num < 2) {
			System.out.println("잘못된 숫자");
		} else { 
			int i = 2;
		while(i<=num) {
			System.out.println(i);
			int j = 1;
			while(j<=9) {
				System.out.println(i+"x"+j+"="+(i*j)+"");
				j++;
			}
			i++;
		}
		}
	}
}
