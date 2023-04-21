package pack03_constructor;

public class Ex03_CarMain {
	public static void main(String[] args) {
		Ex03_Car ec = new Ex03_Car("아우디","A7", "white");
		
		System.out.println(ec.company);
		System.out.println(ec.model);
		System.out.println(ec.color);
		
	}
}
