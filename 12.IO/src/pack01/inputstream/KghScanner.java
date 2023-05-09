package pack01.inputstream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class KghScanner {
	private InputStream in;
	private BufferedReader br;

	public KghScanner(InputStream in) {
		this.in = in;
		br = new BufferedReader(new InputStreamReader(in));
	}

	public String nextLine() {
		String inputData;
		try {
			inputData=  br.readLine();
			return inputData;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	//기존 스캐너 nextInt는 숫자 외에값을 입력하면 오류발생 
	//우리가 만드는건 숫자 외에는 -1을 return하는 메소드 만들기
	
	public int nextInt() {
		int inputInt = -1;
		try {
			inputInt = Integer.parseInt(br.readLine());
		} catch (Exception e) {
			//e.printStackTrace();
		} 
		
		return inputInt;
		
	}
	
}
