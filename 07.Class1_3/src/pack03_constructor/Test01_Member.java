package pack03_constructor;

public class Test01_Member {
	String name="김김김";
	String id= "kkk";
	int pw= 1234;
	int ord= 26;
	
	public static void main(String[] args) {
		Test01_Member te = new Test01_Member();
		System.out.println(te.name);
		System.out.println(te.id);
		System.out.println(te.pw);
		System.out.println(te.ord);
	}
	
}
