package pack03_oop1;

//Class: 특성(속성,상태정보), 동작(기능)이 기술 (구현)
//특성: field (변수와 내가 알고있는 모든 것들, 메소드 제외)
//동작: 메소드 (field를 이용하거나 아니면 해당하는 class의 독립적인 기능을 만듬)
public class Product {
	//상품(product): 상품의 번호, 상품의 이름(속성)
	int num;
	String name;
	
	public void display() {
		System.out.println("번호: "+num);
		System.out.println("상품명: " +name);
	}
}
