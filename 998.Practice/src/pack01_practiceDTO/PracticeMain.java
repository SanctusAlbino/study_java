package pack01_practiceDTO;

public class PracticeMain {
	public static void main(String[] args) {
		PracticeDTO[] dtoArr = new PracticeDTO[3];
		PracticeDAO dao = new PracticeDAO();
		dtoArr[0]=new PracticeDTO("김건호", 1, "남자");
		dtoArr[1]=new PracticeDTO("김기곤", 2, "남자");
		dtoArr[2]=new PracticeDTO("김영문", 3, "여자");
		
		
		PracticeDTO[] dtoArr2 = new PracticeDTO[3];
		
		dtoArr2[0]=new PracticeDTO("홍길동", 1, "남자");
		dtoArr2[1]=new PracticeDTO("윤석열", 2, "남자");
		dtoArr2[2]=new PracticeDTO("최예나", 3, "여자");
		
		dao.display(dtoArr);
		
		
		
	}

}
