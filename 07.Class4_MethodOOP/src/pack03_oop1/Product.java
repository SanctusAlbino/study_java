package pack03_oop1;

//Class: 특성(속성,상태정보), 동작(기능)이 기술 (구현)
//특성: field (변수와 내가 알고있는 모든 것들, 메소드 제외)
//동작: 메소드 (field를 이용하거나 아니면 해당하는 class의 독립적인 기능을 만듬)
public class Product {
	//상품(product): 상품의 번호, 상품의 이름(속성)
	// 상태정보: DTO ▶ DTO Class, VO Class
	// Data Transper Object, Value Object
	// 데이터를 담고있는 객체
	int num1;
	int num2;
	

	
	public Product(int x, int y) {
		
		this.num1 = x;
		this.num2 = y;
	}

	// 메소드(기능) : DAO Class
	//  Data Access Object : DTO를 이용해서 동작하는
	// 기능, 또는 해당하는 클래스와 관련된 기능을 모아둠.
	void display() {
		System.out.println("x+y=" +num1+num2);
		
	}



	
	
	
}
