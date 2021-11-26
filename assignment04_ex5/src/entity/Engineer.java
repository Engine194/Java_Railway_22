package entity;

import enumerate.Gender;

public class Engineer extends Employee{
	private String traing;
	
	public Engineer(String fullname, int age, Gender gender, String address, String traing) {
		super(fullname, age, gender, address);
		this.traing = traing;
	}
	
	public Engineer(Employee employee, String traing) {
		super(employee.getFullname(),
				employee.getAge(),
				employee.getGender(),
				employee.getAddress());
		this.traing = traing;
	}

	public Engineer(String fullname, int age, Gender gender, String address) {
		super(fullname, age, gender, address);
	}

	public Engineer() {
		super();
	}

	public String getTraing() {
		return traing;
	}

	public void setTraing(String traing) {
		this.traing = traing;
	}

	@Override
	public String toString() {
		return "Engineer [traing=" + traing + ", getFullname()=" + getFullname() + ", getAge()=" + getAge()
				+ ", getGender()=" + getGender() + ", getAddress()=" + getAddress() + "]";
	}

}
