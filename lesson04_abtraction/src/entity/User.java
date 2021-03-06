package entity;

public class User {
 	private	String name;
 	private	double salaryRatio;
	
 	public User(String name, double salaryRatio) {
		super();
		this.name = name;
		this.salaryRatio = salaryRatio;
	}

	public User() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalaryRatio() {
		return salaryRatio;
	}

	public void setSalaryRatio(double salaryRatio) {
		this.salaryRatio = salaryRatio;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", salaryRatio=" + salaryRatio + "]";
	}
	
//	public abstract double calculatePay();
	
	public void displayInfor() {
		System.out.println(this.toString());
		if (this instanceof User) {
			System.out.println("this là một instance của User");
			
		}
	}
 	
}
