package pack04.extend;

public class ExamMain {
	public static void main(String[] args) {
		DmbPhone dmbP = new DmbPhone(1, "검정", "LG");
		
		dmbP.powerOn();
		dmbP.bell();
		dmbP.sendVoice("여보세요");
		dmbP.receiveVoice("혹시 보험 됬어요?");
		dmbP.hangUp();
		//cellPhone에서 구현 해놓은 기능
		dmbP.turnOnDmb();
		dmbP.changeChannel(5);
		dmbP.turnOffDmb();
		dmbP.powerOff();
	}
}
