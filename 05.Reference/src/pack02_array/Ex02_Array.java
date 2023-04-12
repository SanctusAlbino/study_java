package pack02_array;

public class Ex02_Array {
	public static void main(String[] args) {
		//1. 10의 크기를 가진 int형 배열을 만들고 값을 10~100까지 할당하고 출력해보기.
		//출력 결과: 배열 이름 [인덱스] 10...100
		int[] scoreArray = new int [10]; //10의 크기를 가진 int형 배열을 만들고
//		scoreArray [0]=10;
//		scoreArray [1]=20;
//		scoreArray [2]=30;
//		scoreArray [3]=40;
//		scoreArray [4]=50;
//		scoreArray [5]=60;
//		scoreArray [6]=70;
//		scoreArray [7]=80;
//		scoreArray [8]=90;
//		scoreArray [9]=100; //10~100까지 할당하고 출력해보기
		for(int i= 0; i<10; i++) {
			scoreArray [i] = (i+1)*10;
			System.out.println(scoreArray[i]);
		}
		//현재 배열에는 10~100까지의 수가 담아져있음.
		//-> 배열의 누적합을 구해보기. 10~100까지 더한 값 (누적합)과 평균
		int result = 0;
		for (int i =0; i<10; i++) {
			result += scoreArray[i];
		}
		System.out.println(result);
		System.out.println(result/10);
	}
}
