package fifa;

public class FifaDTO {
	private int PLAYER_NUM; 
	private String PLAYER_NAME, PLAYER_AGE, HEIGHT, MAIN_FOOT, POSITION;
	
	
	
	
	public FifaDTO(int pLAYER_NUM, String pLAYER_NAME, String pLAYER_AGE, String hEIGHT, String mAIN_FOOT,
			String pOSITION) {
		PLAYER_NUM = pLAYER_NUM;
		PLAYER_NAME = pLAYER_NAME;
		PLAYER_AGE = pLAYER_AGE;
		HEIGHT = hEIGHT;
		MAIN_FOOT = mAIN_FOOT;
		POSITION = pOSITION;
	}
	public int getPLAYER_NUM() {
		return PLAYER_NUM;
	}
	public void setPLAYER_NUM(int pLAYER_NUM) {
		PLAYER_NUM = pLAYER_NUM;
	}
	public String getPLAYER_NAME() {
		return PLAYER_NAME;
	}
	public void setPLAYER_NAME(String pLAYER_NAME) {
		PLAYER_NAME = pLAYER_NAME;
	}
	public String getPLAYER_AGE() {
		return PLAYER_AGE;
	}
	public void setPLAYER_AGE(String pLAYER_AGE) {
		PLAYER_AGE = pLAYER_AGE;
	}
	public String getHEIGHT() {
		return HEIGHT;
	}
	public void setHEIGHT(String hEIGHT) {
		HEIGHT = hEIGHT;
	}
	public String getMAIN_FOOT() {
		return MAIN_FOOT;
	}
	public void setMAIN_FOOT(String mAIN_FOOT) {
		MAIN_FOOT = mAIN_FOOT;
	}
	public String getPOSITION() {
		return POSITION;
	}
	public void setPOSITION(String pOSITION) {
		POSITION = pOSITION;
	}
	
	
}
