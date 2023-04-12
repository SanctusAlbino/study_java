package pack01_String;

import java.util.Scanner;

public class Ex01_String {
	public static void main(String[] args) {
		//String: 기본형 변수 x 참조형 변수 
		//참조형 변수는 스택이라는 메모리 공간에 힙 영역의 주소만 저장하고 실제 값은
		//힙 영역에 있는 형태. (기본형 변수는 힙 영역 사용x)
		String strVar1 = "KGH"; //메모리 주소 1
		String strVar2 = "KGH"; //메모리 주소 1
		// 두개를 비교했을때 결과가 true가 나올까? false가 나올까?
		// 1. 답:  
			
		// 2. if문으로 비교해보기
		if (strVar1==strVar2) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
		//new <- 힙 영역에 공간을 만들다. 
		String strVar3 = new String("KGH");
		String strVar4 = new String("KGH");
		
		Scanner sc = new Scanner(System.in);
		String strVar5 = sc.nextLine(); //이니셜을 대문자로 입력하기
		if (strVar1==strVar5) {
			System.out.println("strVar1=strVar5");
		}else if(strVar3==strVar5) {
			System.out.println("strVar3==strVar5");
		}else {
			System.out.println("strVar1,strVar3,strVar5");
		}
			
		if (strVar3==strVar4) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
		
		// 결과에 대해서 생각해보기
	}
}
