package entity;

public class Employee extends User {
	
//	String name;
//	double salaryRatio;

	public Employee(String name, double salaryRatio) {
		super(name, salaryRatio);
	}
	
	public Employee() {
		super();
	}
	
//	@Override
//	public double calculatePay() {
//		return this.getSalaryRatio() * 420;
//	}
	
}
