package pack01.list;

import java.util.List;
import java.util.Vector;

public class Ex02_Vector {
	public static void main(String[] args) {
		//사용 빈도가 없거나 매우 낮기때문에 이론만 살펴보고 넘어감.
		//List라는 Interface를 상속받았기때문에 기분 구조는 ArrayList, LinkedList, Vector전부 비슷함.
		// ? TestDTO라는 클래스를 묶어서 저장하고 싶다. ?에는 뭘 넣을까?
		//1. List생성해보기
		//2. List에 요소 추가해보기. ※(TestDto)※
		//3. List에 있는 요소 출력해보기
		
		List<TestDTO> list = new Vector<TestDTO>();
//		TestDTO td = null;
//		TestDTO td1 = new TestDTO("FirstName", "LastName");
//		System.out.println(td1.getFirstName());
//		list.add(td);
//		list.add(td1);
		list.add(new TestDTO("FirstName", "LastName"));
		System.out.println(list.get(0).getFirstName());
		System.out.println(list.get(0).getLastName());
		
		
	
	}
}
