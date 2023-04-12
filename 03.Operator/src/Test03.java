import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		//다항연산자 또는 이항연산자를 이용해서 문제 풀어보기
		//Scanner이용해보기
		Scanner sc = new Scanner(System.in);
		String Data1 = sc.nextLine();
		
		//Method (메소드) ==미리 만들어놓은 기능을 호출해서 사용한다==?
		//sc.nextLine()하고 나서 결과는 항상 String==sc.nextLine==String
		//String result=Integer.parselnt(sc.nextLine())%2==1 ? "홀수":"짝수";
		
		//콘솔창을 통해서 입력받아온 String데이터를 int로 바꾼후 해당 숫자가 짝수인지 또는 홀수인지를 판단하여
		//콘솔창에 출력하세요 1=>홀수, 2=>짝수
		
		//콘솔창을 통해서 String데이터를 (숫자) 두개 입력받는다.
		//각각의 숫자는 num1과 num2로 구분한다.
		//두숫자의 더하기, 빼기, 곱하기, 나누기 한 결과를 출력하기
		
		//두숫자 중 더 큰 숫자가 어떤 숫자인지 표시하기
		int sum = Integer.parseInt(Data1);
		String str1 = sum %2 == 1 ? "홀수" : "짝수";
		System.out.println(str1);
		
		String Data2 = sc.nextLine();
		String Data3 = sc.nextLine();
		int num1 = Integer.parseInt(Data2);
		int num2 = Integer.parseInt(Data3);
	    System.out.println("num1+num2=" +(num1+num2));
	    System.out.println("num1-num2=" +(num1-num2));
	    System.out.println("num1*num2=" +(+num1*num2));
	    System.out.println("num1/num2=" +(+num1/num2));
		
		int dum = num1 > num2 ? num1: num2;
		System.out.println("더 큰 숫자는"+dum+"입니다.");
		
	}
}
