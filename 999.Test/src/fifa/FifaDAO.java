package fifa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FifaDAO {
	Connection conn;
	PreparedStatement ps;
	ResultSet rs;

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

	public void selectList() {
		try {
			conn = getConn();
			ps = conn.prepareStatement("select * from KOREA");
			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt("PLAYER_NUM") + rs.getString("PLAYER_NAME"));
			}
		} catch (SQLException e) {
			System.out.println("kghSqlplus Exception" + e.getMessage());

		} finally {
			// conn, ps, rs 세가지 객체 전부 null로 비워줘야함(DB Close)
			dbClose();

		}
	}

//	public void selectList(String keyword) {
//		try {
//			conn = getConn();
//			ps = conn.prepareStatement("select * from KOREA");
//			
//			rs = ps.executeQuery();
//			while (rs.next()) {
//				System.out.println(rs.getString("PLAYER_NAME"));
//			}
//		} catch (SQLException e) {
//			System.out.println("kghSqlplus Exception" + e.getMessage());
//
//		} finally {
//			// conn, ps, rs 세가지 객체 전부 null로 비워줘야함(DB Close)
//			dbClose();
//
//		}
//
//	}
	
//	public void insertBoard() {
//		try {
//			conn=getConn();
//			ps = conn.prepareStatement("insert into KOREA (PLAYER_NAME, PLAYER_AGE, HEIGHT, MAIN_FOOT, POSITION) values (, ?,?,?,?,?)");
//			ps.setString(1, "PLAYER_NAME");
//			ps.setString(2, "PLAYER_AGE");
//			ps.setString(3, "HEIGHT");
//			ps.setString(4, "MAIN_FOOT");
//			ps.setString(5, "POSITION");
//			
//			//rs = ps.executeQuery();
//			int result = ps.executeUpdate();
//			System.out.println(result);
//		} catch (SQLException e) {
//			System.out.println("kghSqlplus Exception" + e.getMessage());
//
//		} finally {
//			dbClose();
//
//		}
//	}

	public void UpdatetList() {
		try {
			ps = conn.prepareStatement("update KOREA set MAIN_FOOT = ? where PLAYER_NUM= ?");
			ps.setString(1, "RIGHT");
			ps.setInt(2, 14);
			int result = ps.executeUpdate();
			System.out.println(result);
		} catch (SQLException e) {
			System.out.println("kghSqlplusㄴㄴㄴ Exception" + e.getMessage());

		} finally {
			// conn, ps, rs 세가지 객체 전부 null로 비워줘야함(DB Close)
			dbClose();

		}
	}

}
