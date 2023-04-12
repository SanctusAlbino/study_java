package pack01_lf;

public class Ex02_ifElse {
	public static void main(String[] args) {
		//if문 : 단순 if (조건식을 주고 해당하는 조건식이 TRUE인 경우의 블러킹(지역{})을 만들어서 코드실행)
		
		//if-else문 : 단순 if문은 조건식이 TRUE일때만 실행이되는 번거러움이 있음.
		//if의 조건식이 TRUE가 아닌 FALSE라면 else라는 키워드를 if문 뒤에 붙여서 FALSE실행부를 만드는것.
		int score = 85;
		if(score %2 ==0) {
			System.out.println("짝수");
		}else { //문법 자체가 if문이 true가 안나왔을때 사용하기때문에 if문이 반드시 있을때만 사용가능
			System.out.println("홀수");
		}
		// int형 변수 num1과num2를 나열을 통해서 초기화 하기 값은 자유롭게 할당.
		// if-else문을 통해서 두 수를 비교하고 어떤 수가 큰지 콘솔창에 출력하게 코딩해보기
		
		int num1 = 1 , num2 =2;
		if(num1>num2) {
			System.out.println("num1큼");
		}else {
			System.out.println("num2큼");
		}
		
		
		
		
		
		
	}//main
}//class
