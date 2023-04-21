package pack03_constructor;

public class Ex03_Car {
	//필드 (멤버)
	String company; //제조사
	String model; //모델
	String color; //색상
	int maxSpeed;
	int speed;
	
	//this <- 나 자신 (중괄호 기준으로 나지신)
	public Ex03_Car(String companya, String model, String color) {
		
		this.company = companya;
		this.model = model;
		this.color = color;
	}
	

	
	
}
