package entity;

import enumerate.Gender;

public class Worker extends Employee{
	private int level;

	public Worker(String fullname, int age, Gender gender, String address, int level) {
		super(fullname, age, gender, address);
		this.level = level;
	}
	
	public Worker(Employee employee, int level) {
		super(employee.getFullname(),
				employee.getAge(),
				employee.getGender(),
				employee.getAddress());
		this.level = level;
	}

	public Worker(String fullname, int age, Gender gender, String address) {
		super(fullname, age, gender, address);
	}

	public Worker() {
		super();
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "Worker [level=" + level + ", getFullname()=" + getFullname() + ", getAge()=" + getAge()
				+ ", getGender()=" + getGender() + ", getAddress()=" + getAddress() + "]";
	}

	
	
}
