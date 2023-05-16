package fifa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class FifaDAO {
	Connection conn;
	PreparedStatement ps;
	ResultSet rs;
	Scanner sc = new Scanner(System.in);

	public Connection getConn() {
		String url = "jdbc:oracle:thin:@211.223.59.99:1521:xe";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, "hanul", "0000");

		} catch (Exception e) {
			System.out.println("개발자 문의");
		}
		return conn;
	}

	public void dbClose() {

		try {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
			if (conn != null) {
				conn.close();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//======================================================================================================
	//회원가입
	public void insertNewId() {
		conn=getConn();
		try {
			
			// 1<- 이미있으니까 가입불가 , 0이면 가입가능
			System.out.println("아이디 중복확인");
			System.out.println("사용하실 아이디를 입력해주세요 ");
			conn = getConn();
			ps = conn.prepareStatement("select COUNT(*) cnt from USERKOREA WHERE USER_ID= ?");
			ps.setString(1, sc.nextLine());
			rs = ps.executeQuery();
			rs.next();
				if (rs.getInt("cnt")>0) {
					System.out.println("이미 존재하는 아이디 입니다. 다시입력해주세요");
					return;
					
				} else {
					System.out.println("사용가능한 아이디입니다.");
				}
				
			System.out.println("아이디와 비밀번호를 입력해주세요.");
			ps = conn.prepareStatement("insert into USERKOREA (USER_ID, USER_PW) values (?,?)");
			ps.setString(1, sc.nextLine());
			ps.setString(2, sc.nextLine());
			//rs = ps.executeQuery();
			int result = ps.executeUpdate();
			System.out.println(result);
		} catch (SQLException e) {
			System.out.println("kghSqlplus Exception" + e.getMessage());

		} finally {
			dbClose();

		}
	}
	
	
	
	
	
	//로그인 창 만들기
	String id;
		

		public boolean login() {
			
			int count = 0;
			while(count<3) {
				System.out.print("아이디 : ");
				id = sc.nextLine();
				System.out.print("비밀번호 : ");
				String pw = sc.nextLine();
			try {
				conn = getConn(); 
				ps = conn.prepareStatement("select * from USERKOREA "
								+ "where USER_ID = '"+id+"' "
								+ "AND USER_PW = '"+pw+"'");
				rs = ps.executeQuery();
				if(rs.next()) {
					System.out.println("로그인 성공");
					return true;
				}else {
					System.out.println("시도 횟수 3회 초과");
				}
			} catch (SQLException e) {
				System.out.println("sbnSqlplus Exception : "+e.getMessage());
			}
			count++;
			}
			return false;
		}
	
	
	
	
	
	//===================================================================================================
	public void selectAll() {
		try {
			conn = getConn();
			ps = conn.prepareStatement("select * from KOREA");
			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println("등번호: " + rs.getInt("PLAYER_NUM") +" "+ "이름: "+ rs.getString("PLAYER_NAME")+" " +"나이: "+ rs.getString("PLAYER_AGE")+" "
						+"키: "+ rs.getString("HEIGHT")+" " + "주발: "+ rs.getString("MAIN_FOOT")+" " + "포지션: "+ rs.getString("POSITION"));
			}
		} catch (SQLException e) {
			System.out.println("kghSqlplus Exception" + e.getMessage());

		} finally {
			// conn, ps, rs 세가지 객체 전부 null로 비워줘야함(DB Close)
			dbClose();

		}
	}

	public void selectList() {
		try {
			conn = getConn();
			ps = conn.prepareStatement("select * from KOREA WHERE PLAYER_NAME = ?");
			System.out.println("보고싶은 선수의 이름을 입력해주세요.");
			ps.setString(1, sc.nextLine());

			rs = ps.executeQuery();
			if (rs.next()) {
				System.out.println("등번호 : " +rs.getInt("PLAYER_NUM"));
				System.out.println("이름 : " + rs.getString("PLAYER_NAME"));
				System.out.println("나이 : " +rs.getString("PLAYER_AGE"));
				System.out.println("키 : " +rs.getString("HEIGHT"));
				System.out.println("주발 : " +rs.getString("MAIN_FOOT"));
				System.out.println("포지션 : " +rs.getString("POSITION"));
			} else {
				System.out.println("등록되지않은 선수입니다.");
			}
		} catch (SQLException e) {
			System.out.println("kghSqlplus Exception" + e.getMessage());

		} finally {
			// conn, ps, rs 세가지 객체 전부 null로 비워줘야함(DB Close)
			dbClose();

		}

	}

	public void insertKOREA() {
		conn=getConn();
		try {
			System.out.println("추가하실 정보입력");
			ps = conn.prepareStatement("insert into KOREA (PLAYER_NUM, PLAYER_NAME, PLAYER_AGE, HEIGHT, MAIN_FOOT, POSITION) values (?,?,?,?,?,?)");
			ps.setString(1, sc.nextLine());
			ps.setString(2, sc.nextLine());
			ps.setString(3, sc.nextLine());
			ps.setString(4, sc.nextLine());
			ps.setString(5, sc.nextLine());
			ps.setString(6, sc.nextLine());
			
			//rs = ps.executeQuery();
			int result = ps.executeUpdate();
			System.out.println(result);
		} catch (SQLException e) {
			System.out.println("kghSqlplus Exception" + e.getMessage());

		} finally {
			dbClose();

		}
	}

	public void UpdatetList() {
		conn= getConn();
		try {
			System.out.println("수정하실 정보");
			ps = conn.prepareStatement("update KOREA set MAIN_FOOT = ? where PLAYER_NAME= ?");
			ps.setString(2, sc.nextLine());
			ps.setString(1, sc.nextLine());
			int result = ps.executeUpdate();
			System.out.println(result);
			System.out.println("수정완료");
		} catch (SQLException e) {
			System.out.println("kghSqlplusㄴㄴㄴ Exception" + e.getMessage());

		} finally {
			// conn, ps, rs 세가지 객체 전부 null로 비워줘야함(DB Close)
			dbClose();

		}
	}
	public void deleteKOREA() {
		conn=getConn();
		try {
			System.out.println("삭제하실 정보입력");
			ps = conn.prepareStatement("delete from KOREA where PLAYER_NUM = ? ");
			ps.setString(1, sc.nextLine());
			
			//rs = ps.executeQuery();
			int result = ps.executeUpdate();
			System.out.println(result);
		} catch (SQLException e) {
			System.out.println("kghSqlplus Exception" + e.getMessage());

		} finally {
			dbClose();

		}
	}
	

}
