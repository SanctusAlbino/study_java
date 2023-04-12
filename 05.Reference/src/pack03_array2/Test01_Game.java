package pack03_array2;

import java.util.Random;
import java.util.Scanner;

public class Test01_Game {
	public static void main(String[] args) {
	//숫자는 게임의 난이도가 된다.
	//ex)10입력 => 난이도10임.
	//난이도의 크기를 가진 배열을 만들고 배열의 랜덤한 인덱스에 특정한 다른 값을 숨김.
	//사용자는 어느칸에 특정한 값이 숨어있는지 맞추는 게임
	//new Random().nextInt(바운더리);//0~바운더리 내에서 랜덤한수생성
	//나머지 로직에 대해서는 랜덤하게 자유롭게 진행하면됨.(예를들어 시도횟수등등의 기능추가)
	//예시 ) 사용자가 10입력
	// 난이도는 10임.
	// 배열을 만듬 [] [] [] [] [] [] [] [] [] []
	// 배열의 특정한 인덱스에 랜덤하게 다른값을 숨김 [] [] [] [x ][ ][ ][ ][ ][ ] []
	//사용자가 답을 입력함 . 3=> 오답
	// 사용자가 답을 입력함 . 4=> 정답                  ↑
		Scanner sc = new Scanner(System.in);
		String inputData1 = sc.nextLine();
		int num1 = Integer.parseInt(inputData1);
		System.out.println("게임의 난이도: "+num1);
		int [] array = new int[num1];
		int random =new Random().nextInt(array.length+1);
		for (;;) {
			System.out.println("숫자를 입력하세요. ");
			int num2 = Integer.parseInt(sc.nextLine());
			if (num2==random) {
				System.out.println("정답");
				break;
			}else {
				System.out.println("오답");
			} 
		} 
	}
}
