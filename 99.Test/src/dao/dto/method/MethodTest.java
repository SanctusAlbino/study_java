package dao.dto.method;

public class MethodTest {
	public void waste(int my1) {
		my1 = 1050;
		System.out.println(my1+"버림");
	
	}
	
	public int send(int my2) {
		my2-=100;
		return my2;
	}
	
	
	public static void main(String[] args) {
		MethodTest mtt = new MethodTest();
		mtt.waste(10000000);
		int my = mtt.send(300);
		System.out.println(my);
	}
}
