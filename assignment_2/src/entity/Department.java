package entity;

public class Department {
	private int id;
	private String departmentName;
	
	public Department(int id, String departmentName) {
		super();
		this.id = id;
		this.departmentName = departmentName;
	}

	public Department(String departmentName) {
		super();
		this.id = 2;
		this.departmentName = departmentName;
	}
	
	public Department() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", departmentName=" + departmentName + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Department department = (Department) obj;
		if (this.id == department.id && this.departmentName == department.departmentName) {
			return true;
		}
		return false;
	}
		
}
