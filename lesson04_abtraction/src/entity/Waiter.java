package entity;

public class Waiter extends User {

//	String name;
//	double salaryRatio;
	
	public Waiter(String name, double salaryRatio) {
		super(name, salaryRatio);
	}
	
	public Waiter() {
		super();
	}
	
	@Override
	public double calculatePay() {
		return this.getSalaryRatio() * 220;
	}

}
