
public class Dubug {
	public static void main(String[] args) {
		String str = "aaa";
		//1. breakpoint: 중단점
		//2. step Over: 다음줄
		//resume: 계속 진행 (다음 중단점을 멈추면 다시 중지)
		GetterSetter gs = new GetterSetter();
		gs.setAge(-1);
		
		//1. 해당 줄 코드가 실행되기 전 중지를 함. (변수 조건 환경 등등을 확인하고 그 줄 코드를 진행하게 만듬)
		//2. 그줄을 실행하고 다음줄 실행전 중지
		System.out.println("코드1"+str);
		System.out.println("코드2");
		System.out.println("코드3");
		System.out.println("코드4");
		System.out.println("코드5");
		System.out.println("코드6");
		System.out.println("코드7");
		System.out.println("코드8");
		System.out.println("코드9");
		System.out.println("코드10");
	}
}
