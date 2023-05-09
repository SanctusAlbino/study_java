package pack01.list;

import java.util.ArrayList;
import java.util.List;

public class BoardDAO {
	public List<BoardDTO> getList() {
		List<BoardDTO> list = new ArrayList<BoardDTO>();
		BoardDTO dto = new BoardDTO(1, "제목1", "내용1");
		list.add(dto);
		list.add(new BoardDTO(2, "제목2", "내용2"));
		list.add(new BoardDTO(3, "제목3", "내용3"));
		return list;

	}

	public void getDisplay(List<BoardDTO> list) {
		for (BoardDTO dto : list) {
			System.out.print(dto.getNumber());
			System.out.print(dto.getName());
			System.out.println(dto.getContent());

		}
			
		for (int i = 0; i < list.size(); i++) {
			
			BoardDTO dto = list.get(i);
			System.out.println(list.get(i).getName());
			
			System.out.println(dto.getNumber());
			System.out.print(dto.getName());
			System.out.println(dto.getContent());
		}
	}
}
