
public class Test06 {
	public static void main(String[] args) {
		int kor, mat, eng, mor, spo ;
		kor = 50;
		mat = 100;
		eng = 80;
		mor= 75;
		spo= 30;
		System.out.println(kor);
		System.out.println(mat);
		// 형변환(Casting) : 서로 다른 타입의 변수를 변환시켜 사용함.
		// ex) int<-> double, String <-> int
		int ivalue = 10;
		double dvalue = ivalue+ 0.5;
		System.out.println("ivalue값:"+ ivalue);
		System.out.println("dvalue값:"+ dvalue);
		
		//더 큰 데이터타입을 작은 타입에 담을 때 오류가 발생함
		//개발자가 어떤 타입으로 바꿀건지 명시를 해줘서 강제로 바꿈.
		//우리가 어떤 작업을 함
		ivalue = (int)dvalue; //문제가 발생함= 소숫점 유실
		System.out.println("ivalue값:"+ ivalue);
		System.out.println("dvalue값:"+ dvalue);
		
		String str = "1234"+12; // 123412
		//문자열에 어떤 값을 더하는 것 == 합x =>결합 (글자의 합침)
		int iData = 1234 + 12; // 1246
		// 숫자형 데이터의 합은 == 합 => 값의 합침
		System.out.println(str);
		System.out.println(iData);
		
		//str에는 현재 123412라는 문자열이 저장되어있음.
		//숫자로 바꾸려면 어떻게 해야할까?
		//123412의 값을 숫자로 바꾸고 +1한 결과를 출력해보기
		int sum = Integer.parseInt(str)+1;
		System.out.println(sum);
		
		//boolean (부울형) true 또는 false만 저장이 가능함.
		
		String sum1 = "" +1234+5678+"가나다라";
		System.out.println(sum1);
	}
}
