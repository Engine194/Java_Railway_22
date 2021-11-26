package entity;

import enumerate.Gender;

public class Employee {
	private String fullname;
	private int age;
	private Gender gender;
	private String address;
	public Employee(String fullname, int age, Gender gender, String address) {
		super();
		this.fullname = fullname;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}
	public Employee() {
		super();
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [fullname=" + fullname + ", age=" + age + ", gender=" + gender + ", address=" + address + "]";
	}
}
