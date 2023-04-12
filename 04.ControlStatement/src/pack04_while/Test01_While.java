package pack04_while;

public class Test01_While {
	public static void main(String[] args) {
		//for문 -> while
		//구구단 출력하기 2~9단
		//1. 일자로 밑으로 쭉 나오게하기
		//2. 단별로 줄바꿈을 줘서 옆으로 나오게 하기
		//※while문의 중첩※
		int i = 2;
		while(i<=9) {
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
