package pack06.go.data;

import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.jsoup.Jsoup;

public class JsoupAPI2 {
	public static void main(String[] args) {
		//page=1&perPage=10&serviceKey=MxcNJbdAGfqSjnwUIXZvGP5wCZfhGTP6c3NXq083QTOUYn5nckZQeDeilXjplmc3aDkpHOsfNQbVt2RjzqJDYw%3D%3D
		String url = "https://api.odcloud.kr/api/15040925/v1/uddi:ebf80860-2e97-45a6-9fa8-8801c1d1fe1b";
		String doc = null;
		
		try {
			doc = Jsoup.connect(url).data("page", "1").data("perpage", "10")
			.data("serviceKey", "MxcNJbdAGfqSjnwUIXZvGP5wCZfhGTP6c3NXq083QTOUYn5nckZQeDeilXjplmc3aDkpHOsfNQbVt2RjzqJDYw==")
			.timeout(1000*10)
			.userAgent("Chome")
			.ignoreContentType(true)
			.execute().body();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(doc);
		
		JSONParser parser = new JSONParser();
		try {
			JSONObject jsonObj = (JSONObject)parser.parse(doc);
			System.out.println("파싱성공");
			JSONArray array = (JSONArray)jsonObj.get("data");
			System.out.println("array담기 성공 (JSONArray)");
			for (int i = 0; i < array.size(); i++) {
				JSONObject tempObj = (JSONObject)array.get(i);
				System.out.print("데이터기준일:"+ tempObj.get("데이터기준일")+ "  ");
				System.out.print("상호:"+ tempObj.get("상호")+ "  ");
				System.out.print("업종명:"+ tempObj.get("업종명")+ "  ");
				System.out.println("영업소소재지(도로명):"+ tempObj.get("영업소소재지(도로명)")+ "  ");
				
			}
			
			
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
	}
}
