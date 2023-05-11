package pack03.mysqlplus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class SqlDAO {
	Connection conn;  // sqlplus에서 실제로 사용자명과 비밀번호를 입력받았을때 접속을 시도하는 연결객체
	PreparedStatement ps; //쿼리를 전송 실행 객체
	ResultSet rs; // 결과를 받아오기위한 객체
	
	public boolean checkConnection(String user, String password) {
		//메인에서 입력한 사용자명과 비밀번호를 여기 메소드까지 가지고와야함.
		//sqlPlusMain에서 checkConnection메소드를 호출하는데 사용자명과 비밀번호가 출력될수있게 해보기
		System.out.println("check: "+user+" "+password);
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		//oracle.jdbc.driver.OracleDriver
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			
			if(!conn.isClosed()) {
				System.out.println("다음에 접속됨"+conn.getMetaData().getDatabaseProductVersion());
				return true;
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("오라클 드라이버가 준비가 안되어서 사용이 불가능한 pc입니다.");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("개발자 문의");
		}
		return false;
		
	}
	
	public void sendSql(String sql) {
		try {
			ps = conn.prepareStatement(sql); // main에서 사용자가 입력한 sql쿼리를 sendSqlMethod에 가져오기
			rs= ps.executeQuery();
			while(rs.next()) { //데이터를 조회할때 컬럼의 별칭이나 이름을 모르는 상태로 조회를하면
								// DTO에 담을수가 없기때문에 이런 방법은 사용을 안한다.
				//System.out.println("조회 해서 가져옴");
				
				for (int i = 0; i < rs.getMetaData().getColumnCount(); i++) {
					System.out.println(rs.getString(i)); //커럼의 헤드(별칭)을 따로 반복문을 통해서 추출하고 또 데이터 건수만큼
													//반복처리가 필요한데 거기까지는 우리가 작업을 할 필요가없음
				}System.out.println();
			}
		} catch (SQLException e) {
			System.out.println("kghSqlplus Exception"+e.getMessage());
			
		}
	}
}


