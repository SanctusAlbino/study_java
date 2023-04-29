package pack04.extend;

public class ExamMainSmart {
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone(1, "미드나잇그린", "애플", 5);
		sp.powerOn();//CellPhone
		sp.turnOnDmb();//DmbPhone
		sp.useInternet();//SmartPhone
	}
}
