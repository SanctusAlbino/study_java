package pack04_oop2;

public class StudentMain {
	public static void main(String[] args) {
	//	Student stu1 = new Student(1, "김건호", 50, 100, 50);
//		stu1.num = 1;
//		stu1.name = "김건호";
//		stu1.score1= 50;
//		stu1.score2= 100;
//		stu1.score3= 50;
//		stu1.sum= stu1.score1+stu1.score2+stu1.score3;
//		stu1.avg= stu1.sum/3;
	//	stu1.display();
		//DTO 상태정보
		//DAO 기능
		StudentDTO dto1 = new StudentDTO(1, "김건호", 50, 100, 50);
		StudentDTO dto2 = new StudentDTO(2, "rlarjsgh", 60, 10, 20);
		StudentDAO dao = new StudentDAO();
		dao.display(dto1);
		dao.display(dto2);
		
		
	}
}
