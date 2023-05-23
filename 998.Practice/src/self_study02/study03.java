package self_study02;

import java.util.Scanner;

public class study03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dataA = Integer.parseInt(sc.nextLine());
		int dataB = Integer.parseInt(sc.nextLine());
		System.out.println(dataA);
		System.out.println(dataB);
		if(dataA==dataB) {
			System.out.println("같다.");
		}else if(dataA<dataB){
			System.out.println("B가 크다");
		}else {
			System.out.println("작다");
		}
	}
}
