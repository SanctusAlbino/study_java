package pack02.outputstream;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Ex02_OutputStream {
	public static void main(String[] args) throws IOException {
		OutputStream os = System.out;
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		bw.write("이것은 문자열입니다. \n줄바꿈");
		bw.newLine();
		bw.flush();
	}
}
