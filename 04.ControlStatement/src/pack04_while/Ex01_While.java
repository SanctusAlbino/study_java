package pack04_while;

public class Ex01_While {
	public static void main(String[] args) {
		//for (① 반복에 사용 할 변수 초기화 식 ②조건식(TRUE일때 동작)④증감식){
			//③실제 반복할 코드 (구간)
		//}
		
		//①변수 초기화식
		//while (②조건식){
			//반복하는 구간
			//③증감식 or break를 이용한 반복문 종료
		//}
//		int i=0;
//		while(i<10) {
//			System.out.println(i);
//			i++;
//		}
		//while문을 이용해서 홀수만 출력해보기. <- 1~50
		int j=1;
		while(j<=50) {
			if(j%2==1) {
				System.out.println(j);
			}
			j++;
		}	
	}
}
