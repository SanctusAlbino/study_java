package pack01_lf;

public class Ex05_ifElseIf {
	public static void main(String[] args) {
		//if else문으로는 어떤 조건을 줄때 true인지와 false인지 두가지 경우만 만들수가 있음 ex)짝수? Y else N
		//if (조건식 A) {
			//조건식A가 TRUE일때 실행할 코드를 넣어줌
		//} else if (조건식B)
			//조건식A가 TRUE가 아니고 조건식 B일때 실행할 코드를 넣어줌
		//} else if (조건식C)
			//조건식A와B가 TRUE가 아니고 조건식 C일때 실행할 코드를 넣어줌
		//} else {
			//if와elseif의 모든 조건이 TRUE가 아닐때 실행부(규칙 : if문 블럭킹 끝에 붙여서 사용한다.)
		//}
		int score = 70; // 기존 방식 90이상A 80이상B 70이상C 그외 D
		//if else만 이용해서 
		if (score >=90) {
			System.out.println("A");
		}
		if (score >=80&& score <90) {
			System.out.println("B");
		}
		if (score >=70&& score <80) {
			System.out.println("C");
		}
		if (score < 70) {
			System.out.println("D");
		}
		
		if (score >=90) {
			System.out.println("A");
		}else if (score >=80) {
			System.out.println("B");
		}else {
			System.out.println("E");
		}
		
		if (score >=90) {
			System.out.println("A");
		}else if (score >=80) {
			System.out.println("B");
		}else if (score >=70) {
			System.out.println("C");
		}else if (score <70) {
			System.out.println("D");
		}
		
		
		
	}
}
