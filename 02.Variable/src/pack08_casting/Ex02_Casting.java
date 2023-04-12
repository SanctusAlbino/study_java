package pack08_casting;

public class Ex02_Casting {
	public static void main(String[] args) {
		//문자열 = "12" + 34 = 1234
		//Sting + int = String
		//why? 문자열 + 어떤값 = 문자열 규칙
		// 문자열 결합의 법칙
		// "1"(String) 다르다 1(숫자)
		String sum = "12" + 34;
		//어떤 값을 String으로 바꾸는 것은 엄청나게 간단하다.
		String sum2 = "" + 1234 ;
		
		// String sum , sum2 변수에 문자열로 숫자를 저장해둠.
		// 두개의 합을 알고싶다. "1234" + "1234"
		// sum + sum2 = 12341234
		// 숫자 1234 + 1234 = 2468의 결과를 얻어야 한다.
		// String => int?
		// int, double 등의 보라색으로 글씨 바뀌는것 => 기본타입
		// 대문자로 시작하는 것들은 대부분 Class 타입
		// 기본 데이터 타입은 Wrapper class라는 것을 가지고 있다.
		// int => Interger, double Double
		// String을 해당하는 타입으로 바꿔주는 행위를 한는 것 
		// String에 있는 ""<= 제거한다.
		int num = Integer.parseInt(sum);
		// num2에 sum2를 숫자로 바꿔서 넣어보기
		int num2 = Integer.parseInt(sum2); //"1234"
		System.out.println(num+num2);
		String sAvg = "88.6";
		//위에 +10을 한 결과를 얻고싶음. (98.6)
		//  sAvg <= double형태로 바꾸는것 해보기
		double dAvg = Double.parseDouble(sAvg) + 10;
		System.out.println(dAvg);
		//WrapperClass.parseDataType(string); => DataType
		String str = "123";
		//위의 해당 데이터를 숫자로 바꿀 수 있을까? wrapperClass이용
		double dValue = Double.parseDouble(str);
		System.out.println(dValue);
		//Float.parseFloat(sAvg)
		//Long.parseLong(sAvg)
		//Byte.parseByte(sAvg)
		
	}
}
