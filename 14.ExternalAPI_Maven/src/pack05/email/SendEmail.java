package pack05.email;

import java.net.URL;

import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;

public class SendEmail {
	public static void main(String[] args) {
		SendEmail se = new SendEmail();
		// se.sendSimple();
		//se.sendMulti();
		se.sendHtml();
	}

	// 1. 단순하게 텍스트만 있는 이메일 : simple email
	// 2. 첨부파일이나 url 등으로 이미지가 있는 이메일 : MultiPartEmail
	// 3. 모든 기능을 가지고 html 태그까지 사용 가능한 이메일 : HmtlEmail
	public void sendSimple() {
		SimpleEmail mail = new SimpleEmail();
		// smtp.naver.com

		mail.setHostName("smtp.naver.com");
		mail.setCharset("utf-8"); // 한글 깨짐 방지
		mail.setDebug(true); // 오류를 찾아서 개발을 하고있는 과정인지

		mail.setAuthentication("ghk1998", "rlarjsgh0301");
		mail.setSSLOnConnect(true);
		// ======================= 고정 어떤메일을 쓰든 smtp서버와 smtp 서버를 이용할수있는 고객인증

		// 송신인
		try {
			mail.setFrom("ghk1998@naver.com", "한울KGH");
			mail.addTo("ghk1998@naver.com", "한울KGHTO");
			mail.setSubject("회원가입 축하");
			mail.setMsg("내용입니다");

			mail.send();

		} catch (EmailException e) {
		} catch (Exception e) {
			System.out.println(" 이메일 오류 아닌거" + e.getMessage());
		}

	}

	public void sendHtml() {
		HtmlEmail mail = new HtmlEmail();
		// smtp.naver.com

		mail.setHostName("smtp.naver.com");
		mail.setCharset("utf-8"); // 한글 깨짐 방지
		mail.setDebug(true); // 오류를 찾아서 개발을 하고있는 과정인지

		mail.setAuthentication("ghk1998", "비밀번호");
		mail.setSSLOnConnect(true);
		// ======================= 고정 어떤메일을 쓰든 smtp서버와 smtp 서버를 이용할수있는 고객인증

		// 송신인
		try {
			mail.setFrom("ghk1998@naver.com", "한울KGH");
			mail.addTo("ghk1998@naver.com", "한울KGHTO");
			mail.addTo("youngmoon525@naver.com", "김건호KGH");
			
			mail.setSubject("회원가입 축하");
			
			//메일의 내용이 일반 글자가 아니라 html형태로 보낼꺼기 때문에 바꿈
			StringBuffer msg = new StringBuffer(); //"A", "A"+"B"
			msg.append("<html>");
			msg.append("<body>");
			//html String으로 만들기 경연대회
			msg.append("<h1> HELP ME...! </h1>");
			msg.append("<p> too hard... </p>");
			msg.append("<h2> 살려주세요 </h2>");
			msg.append("<p> 어려우어ㅕㅇ </p>");
			
			
			
			msg.append("</body>");
			msg.append("</html>");
			
			mail.setHtmlMsg(msg.toString());
			

//			EmailAttachment file = new EmailAttachment();
//			//file.setPath("‪D:\\Study_Java\\WorkSpace\\12.IO_FileTest\\pic.jpg"); // 이미지 파일 경로를 넣어줌
//			//mail.attach(file);
//			file.setURL(new URL("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT6XypT9CzoXN60AoEj6MFesk3FZ1XGQP1853I5BqS2Wg&s"));
//			mail.attach(file);
//			mail.send();
//		} catch (EmailException e) {
//			e.printStackTrace();
//		} catch (Exception e) {
//			System.out.println(" 이메일 오류 아닌거" + e.getMessage());
//		}

	}

	public void sendMulti() {
		MultiPartEmail mail = new MultiPartEmail();
		// smtp.naver.com

		mail.setHostName("smtp.naver.com");
		mail.setCharset("utf-8"); // 한글 깨짐 방지
		mail.setDebug(true); // 오류를 찾아서 개발을 하고있는 과정인지

		mail.setAuthentication("ghk1998", "rlarjsgh0301");
		mail.setSSLOnConnect(true);
		// ======================= 고정 어떤메일을 쓰든 smtp서버와 smtp 서버를 이용할수있는 고객인증

		// 송신인
		try {
			mail.setFrom("ghk1998@naver.com", "한울KGH");
			mail.addTo("ghk1998@naver.com", "한울KGHTO");
			mail.addTo("mbj98@naver.com", "나");
			mail.setSubject("회원가입 축하");
			mail.setMsg("내용입니다");

			EmailAttachment file = new EmailAttachment();
			//file.setPath("‪D:\\Study_Java\\WorkSpace\\12.IO_FileTest\\pic.jpg"); // 이미지 파일 경로를 넣어줌
			//mail.attach(file);
			file.setURL(new URL("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT6XypT9CzoXN60AoEj6MFesk3FZ1XGQP1853I5BqS2Wg&s"));
			mail.attach(file);
			mail.send();
		} catch (EmailException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(" 이메일 오류 아닌거" + e.getMessage());
		}

	}

	
}
