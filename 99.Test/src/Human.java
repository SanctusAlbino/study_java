
public class Human {
	//접근 제한자: private????, public, default??
	//public: 같은 프로젝트 내에서
	//default: 같은 패키지 내에서
	//private: 같은 클래스 내부에서만 
	public String ask; // 같은반 내부
	String look; // 옆에서 지켜보기
	private String river; // 간 
	
	public String getRiver(boolean isDoctor) {
		if(isDoctor) {
			return this.river;
		}else {
			return "당신은 의사가 아니기에 접근 불가!";
		}
		
	}
	
	public void setRiver(String river) {
		if(river.equals("싱싱한간")) {
			this.river=river;
		}else {
			System.out.println("바꿀수 없음");
		}
	}
	
	
}
