package pack06_oop3;

public class ProductDAO {
	public void display(ProductDTO dto) {
		System.out.print("번호:"+dto.getNum()+",");
		System.out.print("번호:"+dto.getName()+",");
		System.out.print("번호:"+dto.getPrice()+",");
		System.out.println("번호:"+dto.getCnt());
	}
}
