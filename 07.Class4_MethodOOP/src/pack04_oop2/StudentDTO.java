package pack04_oop2;

public class StudentDTO {
	int num;
	String name;
	int score1, score2, score3, sum;
	double avg;
	

	
	public StudentDTO(int num, String name, int score1, int score2, int score3) {
		super();
		this.num = num;
		this.name = name;
		this.score1 = score1;
		this.score2 = score2;
		this.score3 = score3;
		this.sum = this.score1+this.score2+this.score3;
		this.avg = (double)(this.score1+this.score2+this.score3)/3;
	}
}
