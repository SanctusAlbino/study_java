package pack03_array2;

import java.util.Scanner;

public class Ex04_Mbti {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] mbti = new int [4];
		String [][] mbtiWord = {
				{"E","I"},{"N","S"},{"F","T"},{"J","P"}	
		};
		System.out.println("나는 지금 우리반 사람들과 노래방에 가서 노래부를 수 있다. 1.y 2.n");
		mbti[0] = Integer.parseInt(sc.nextLine());
		System.out.println("나는 한문철TV문제를 잘 맞춘다. 1.y 2.n");
		mbti[1] = Integer.parseInt(sc.nextLine());
		System.out.println("나는 월드컵 16강 확정지을 때 울컥했다. 1.y 2.n");
		mbti[2] = Integer.parseInt(sc.nextLine());
		System.out.println("나는 오늘 당장 오후 수업이 공강이 되면 싫어할 것이다. 1.y 2.n");
		mbti[3] = Integer.parseInt(sc.nextLine());
		String result = "";
		for(int i= 0; i<mbti.length; i++) {
			result+= mbtiWord[i][mbti[i]-1];
		} System.out.println("내 MBTI는 : "+result);
	}
}
