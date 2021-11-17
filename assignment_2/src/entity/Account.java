package entity;

public class Account {
	private int id;
	private String fullname;
	private Department department;
	
	public Account(int id, String fullname, Department department) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.department = department;
	}

	public Account() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", fullname=" + fullname + ", department=" + department + "]";
	}
		
}
