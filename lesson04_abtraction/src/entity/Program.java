package entity;

public class Program {

	public static void main(String[] args) {
		Employee employee = new Employee("Minh Tri", 1.0);
		Manager manager = new Manager("Tuan Anh", 6.9);
		Waiter waiter = new Waiter("Hoai Le", 0.7);
		
		employee.displayInfor();
		manager.displayInfor();
		waiter.displayInfor();
		System.out.println("Luong cua " + employee.getName() + " la: " + employee.calculatePay());
		System.out.println("Luong cua " + manager.getName() + " la: " + manager.calculatePay());
		System.out.println("Luong cua " + waiter.getName() + " la: " + waiter.calculatePay());
	}

}
