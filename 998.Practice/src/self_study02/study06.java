package self_study02;

import java.util.Scanner;

public class study06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dataA = Integer.parseInt(sc.nextLine());
		int dataB = Integer.parseInt(sc.nextLine());
		System.out.println(dataA);
		System.out.println(dataB);
		int sum=0;
		for (int i = dataB; i <=dataA; i++) {
			System.out.println(i);
			sum+=i;
		}	System.out.println(sum);
	}
}
