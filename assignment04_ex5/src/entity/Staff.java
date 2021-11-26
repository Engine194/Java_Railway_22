package entity;

import enumerate.Gender;

public class Staff extends Employee {
	private String work;
	
	public Staff(String fullname, int age, Gender gender, String address, String work) {
		super(fullname, age, gender, address);
		this.work = work;
	}

	public Staff(Employee employee, String work) {
		super(employee.getFullname(),
				employee.getAge(),
				employee.getGender(),
				employee.getAddress());
		this.work = work;
	}

	public Staff(String fullname, int age, Gender gender, String address) {
		super(fullname, age, gender, address);
	}

	public Staff() {
		super();
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	@Override
	public String toString() {
		return "Staff [work=" + work + ", getFullname()=" + getFullname() + ", getAge()=" + getAge() + ", getGender()="
				+ getGender() + ", getAddress()=" + getAddress() + "]";
	}
	
}
