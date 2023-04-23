package pack06_oop3;

public class ProductMain {
	public static void main(String[] args) {
		String[] strArr = new String[5];//1~2번 같은 , 3번은 문자열 길이 출력
		// 0~(5-1), 0 ,1 ,2 ,3 ,4
		strArr[0]="1"; 
		
		ProductDTO[] dtoArr = new ProductDTO[5];
		ProductDAO dao = new ProductDAO();
		//처음보는 타입을 배열로 묶을때 어려움이 있으면 해당하는 타입을 먼저 객체로 생성해보기
		//생성한 객체를 배열의 임의의 인덱스에 넣어보기
		//객체 생성시 사용한 생성자 또는 값을 배열의 인덱스에 넣게 수정
		dtoArr[0] = new ProductDTO(1, "컴퓨터", 10000, 5);
		dtoArr[1] = new ProductDTO(2, "노트북", 20000, 4);
		dtoArr[2] = new ProductDTO(3, "라면", 2000, 10);
		dtoArr[3] = new ProductDTO(4, "커피", 1000, 3);
		dtoArr[4] = new ProductDTO(5, "마우스", 5000, 4);
		for (int i = 0; i < dtoArr.length; i++) {
			dao.display(dtoArr[i]);
		}
		
		
		//1. dtoArr: 1.0~4까지는 어떤 데이터가 들어있을까?
		
		//2. dtoArr[0]= ?값 대입을 뭘 해줘야할까?
		
		//3.dtoArr를 이용해서 상품 번호 출력해보기
		
		
//		ProductDTO dto1 = new ProductDTO(1, "컴퓨터", 10000, 5);
//		ProductDTO dto2 = new ProductDTO(2, "노트북", 20000, 4);
//		ProductDTO dto3 = new ProductDTO(3, "라면", 2000, 10);
//		ProductDTO dto4 = new ProductDTO(4, "커피", 1000, 3);
//		ProductDTO dto5 = new ProductDTO(5, "마우스", 5000, 4);
//		ProductDAO dao = new ProductDAO();
//		dao.display(dto1);
//		dao.display(dto2);
		
//		ProductDAO.display(dto1);
//		ProductDAO.display(dto2);
		//System.out.println(dto.cnt); <-private 접근제한자로 변수의 바로접근을 막아놓음
		//System.out.println(dto.getNum());
		//매번 dto의 내용을 하나씩 getter로 불러오는게 아니라 display()라는 메소드를 DAO구현하고
		//해당하는 메소드 호출시 dto의 내용을 보여줄수있게 해보기
		//번호:1, 이름:컴퓨터, 가격:10000, 수량:5
	}
}
