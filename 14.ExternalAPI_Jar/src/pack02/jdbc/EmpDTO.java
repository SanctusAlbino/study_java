package pack02.jdbc;

public class EmpDTO {
	//Database에서 조회된 select Employee_id, first_name||' '||last_name, email from employees
	//쿼리를 보고 DTO를 하나 만들어보기
	
	private int id;
	private String name, email;
	
	public EmpDTO(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
