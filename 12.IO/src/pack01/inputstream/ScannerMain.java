package pack01.inputstream;

public class ScannerMain {
	public static void main(String[] args) {
		
	//KghScanner를 인스턴스화 하여 문자열을 입력받아 출력해보기
	KghScanner ks = new KghScanner(System.in);
	
	String inputData = ks.nextLine();
	System.out.println(inputData);
	int inputInt = ks.nextInt();
	System.out.println(inputInt);
	}
}
