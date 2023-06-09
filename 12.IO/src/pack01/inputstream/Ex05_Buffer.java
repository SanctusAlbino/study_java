package pack01.inputstream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex05_Buffer {
	public static void main(String[] args) throws IOException {
		//키보드에서 여러글자를 입력받아서 줄 단위로 작업: Scanner 보다 빠름 , 백준에서 문제 풀때 Buffer사용을 권장함.
		//InputStream - > InputStreamReader -> BufferedReader
		//InputStream is = System.in;
		//InputStreamReader isr = new InputStreamReader(is)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String inputData = br.readLine();
		System.out.println("입력하신 글자는"+inputData+"입니다.");
		br.close();//사용후 닫아준다. (전원을 끈다.)
	}
}
