package pack01.myjar;

import java.util.ArrayList;

import pack01.list.BoardDAO;
import pack03_constructor.Test01_MemberDTO;

public class Ex01_Myjar {
	public static void main(String[] args) {
		//자바프로젝트를 계속해서 만들고 있는데 해당하는 프로젝트가 기능을 가지고,
		//완성이되어서 외부에서 사용이 되어야할때 여러가지 확장자로 추출이 될수있다. (export)
		// Scanner, Random 등은 사실 자바프로젝트로 이미 만들어놓고 추출되어 기본 Java언어에 포함되어있는 기능들이ㅏㄷ.
//		BoardDAO dao = new BoardDAO();
//		List<BoardDTO> list = new ArrayList<BoardDTO>();
//		dao.getDisplay(null);
		Test01_MemberDTO tmd = new Test01_MemberDTO("kgh", "ghgh", "김김김", 26);
		
		
	}
}
