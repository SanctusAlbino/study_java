package pack06.go.data;

import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.jsoup.Jsoup;

public class JsoupAPI {
	public static void main(String[] args) {
		//page=2&perPage=10&serviceKey=MxcNJbdAGfqSjnwUIXZvGP5wCZfhGTP6c3NXq083QTOUYn5nckZQeDeilXjplmc3aDkpHOsfNQbVt2RjzqJDYw%3D%3D
		// Jsoup API를 사용하기 : http형태로 되어있는 데이터를 json 또는  xml등의 형태로  String으로 가져옴.
		//String을 JsonParser, JsonObject를 이용하여 우리가 활용가능한 변수타입으로 각각을 빼오는 작업을 한다.
		//http의 요청은 인터넷 주소인  URL을 알아야함
		//인터넷 주소에 요청할때 보내주는 파라메터는 전부 String
		String url = "https://api.odcloud.kr/api/3082925/v1/uddi:7c291067-a956-4811-a9ec-942b6979ff77_201709270816";
		String doc = null;
		
		try {
			doc = Jsoup.connect(url).data("page", "2").data("perpage", "10")
			.data("serviceKey", "MxcNJbdAGfqSjnwUIXZvGP5wCZfhGTP6c3NXq083QTOUYn5nckZQeDeilXjplmc3aDkpHOsfNQbVt2RjzqJDYw==")
			.timeout(1000*10)
			.userAgent("Chome")
			.ignoreContentType(true)
			.execute().body();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//json : key와 value로 구분되어있는 규칙을 가진 데이터타입(String)이다.
		//중괄호 : 하나의 Object (int, String, DTO 등)
		//대괄호 : array ↑ 위의 데이터를 여러건 가진 형태
		
		//JasonParser를 이용해서 String으로 되어있는 Json을 하나씩 빼오는 작업을 할 예정.
		JSONParser parser = new JSONParser();//문자열 => JsonObject 형태로 바꿔줌
		try {
			JSONObject jsonObj = (JSONObject)parser.parse(doc);
			System.out.println("파싱성공");
			JSONArray array = (JSONArray)jsonObj.get("data");
			System.out.println("array담기 성공 (JSONArray)");
			for (int i = 0; i < array.size(); i++) {
				JSONObject tempObj = (JSONObject)array.get(i);
				System.out.print("상호:"+ tempObj.get("상 호")+ "  ");
				System.out.print("주메뉴:"+ tempObj.get("주메뉴")+ "  ");
				System.out.print("소재지:"+ tempObj.get("소재지")+ "  ");
				System.out.println("연락처:"+ tempObj.get("연락처")+ "  ");
				
			}
			
			
		} catch (ParseException e) {
			//String json이 key와 value를 가진 데이터가 아닌 그냥 일반문자열 이라면 오류가 발생한다.
			e.printStackTrace();
		}
		
		
		System.out.println(doc);
	}
}
