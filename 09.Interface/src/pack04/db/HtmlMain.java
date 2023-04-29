package pack04.db;

import pack02.inter.Audio;
import pack02.inter.Television;

public class HtmlMain {
	public static void main(String[] args) {
		dbWork(new MysqlDAO());
		dbWork(new OracleDAO());
		
	}
	
	//Oracle 또는 Mysql을 입력받아 select~delete 하는 메소드
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.delete();
		dao.update();
	}
}
