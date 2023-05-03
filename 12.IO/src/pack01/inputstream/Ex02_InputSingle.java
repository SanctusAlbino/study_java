package pack01.inputstream;

import java.io.IOException;
import java.io.InputStream;

public class Ex02_InputSingle {
	//-사용자가 영문자를 입력 - > Enter Key입력
	//- Enter를 입력하는 것은 프로그램의 종료 (Terminate: Ctrl+C)가 아니다.
	//- CR (Carriage Return): 커서를 줄의 맨앞으로 이동 (\r)
	//- LF (Line Feed): 커서를 한줄 아래로 이동 (\n)
	public static void main(String[] args) {
		InputStream is = System.in;//콘솔창으로 부터 입력받을 수있게 초기화 되어있음 (console)
		System.out.print("영문자 1글자를 입력하세요:");
		
		try {
			int data = is.read();
			System.out.println(data);//ASCII Code : A를 입력하고 엔터키 입력함.
			System.out.println((char)data);// A-> 65값 나옴
			data = is.read();//남은 데이터가 아직있는지 확인-> 13 
			System.out.println("남은 데이터:" + data);//(CR) enterkey
			data = is.read();// -> 남은 데이터 ->10 
			System.out.println("남은 데이터:" + data);//10 LF 엔터키
			System.out.print("데이터\r\r");
			System.out.print("줄바꿈??");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
