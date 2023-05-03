package dao.dto.method;

public class HumanDAO {
	
	
	//기능: DAO(인스턴스화 1)
		public void seeMovie(HumanDTO dto) {
			System.out.println(dto.eye+"로 봅니당");
		}
		public void ask(HumanDTO dto) {
			System.out.println(dto.mouse +"대화");
		}
		public void coding(HumanDTO dto){
			System.out.println(dto.hand+"gkwkd");
		}
}
