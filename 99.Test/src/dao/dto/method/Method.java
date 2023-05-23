package dao.dto.method;

public class Method {
	public static void main(String[] args) {
		Method mt = new Method();
		mt.동용돈(10);
		
		int money =mt.라면심부름(100000);
		System.out.println("남은 금액은??"+money);
		//반드시 int를 리턴하는 메소드
		// 둘은 같다--> 숫자만 표현가능
		//int
	}
	public void 동용돈(int money) {
		money = 20000; //어떤 기능에 의해서 값이 바뀜 
		System.out.println(money +"돈을 버렸네...");
		System.out.println(money+"원은 메소드 내부에서만 존재하고 그 외에서는 메모리에 존재 x");
	}
	
	public int 라면심부름(int money) {
		System.out.println("심부름 시킴" + money + "원을 줌");
		System.out.println("수고비와 재료 깎임 50000");
		System.out.println("내 위치는 메인 메소드");
		money-= 30000;
		return money;
	}
	
	//void: x : 현실에서 어떤 지시를 했을때 그 결과가 필요없는 경우:
	//동생한테 용돈을 준 경우, 기부, 볼일을 보고 물을 내린경우
	
	
	//return: 현실에서 어떤 지시를 했을 때 그 결과가 필요한 경우:
	//동생한테 라면심부름 시켰을때 가져옴 
}
