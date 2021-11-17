package assignment_2;

import java.util.Scanner;

import entity.Account;
import entity.Department;

public class Program {

	public static void main(String[] args) {

	/**
	 * Question 8:
	Viết chương trình thực hiện theo flow sau:
	
	Bước 1:
	Chương trình in ra text "mời bạn nhập vào chức năng muốn sử
	dụng"
	
	Bước 2:
	Nếu người dùng nhập vào 1 thì sẽ thực hiện tạo account
	Nếu người dùng nhập vào 2 thì sẽ thực hiện chức năng tạo
	department
	Nếu người dùng nhập vào số khác thì in ra text "Mời bạn nhập lại"
	 * */
		
		Scanner scanner = new Scanner(System.in);
		boolean isLoop = true;
		do {
			// 1. In ra text để chọn tính năng
			System.out.println("Mời bạn nhập vào chức năng muốn sử dụng");
			
			// 2. Lấy ra số mà người dùng nhập vào
			int getNumber = 0;
			if (scanner.hasNextInt()) {
				getNumber = scanner.nextInt();
			} else {
				System.out.println("Nhập sai định dạng");
			}
			
			scanner.nextLine();

			// 3. flow control giá trị nhập vào
			switch (getNumber) {
			case 1:
				Account newAccount = createAccount();
				
				if (newAccount != null) {
					System.out.println(newAccount.toString());
				}
				isLoop = false;
				break;
			case 2:
				Department newDepartment = createDepartment();
				
				if (newDepartment != null) {
					System.out.println(newDepartment.toString());
				}
				isLoop = false;
				break;
			default:
				System.out.println("Mời bạn nhập lại");
				break;
			}
		} while (isLoop);
					
	}
	
	// Phương thức tạo Account
	public static Account createAccount() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Mời nhập account id: ");
		int inputId = 0;
		if (scanner.hasNextInt()) {
			inputId = scanner.nextInt();	
			scanner.nextLine();
		} else {
			System.out.println("Nhập sai định dạng");
			return null;
		}
		
		System.out.println("Mời nhập fullname: ");
		String fullname = scanner.nextLine();
		
		Department newDepartment = createDepartment();
		
		Account newAccount = new Account (inputId, fullname, newDepartment);
		scanner.close();
		return newAccount;
	}
	
	// Phương thức tạo Department
	public static Department createDepartment() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Mời nhập department id: ");
		int inputId = 0;
		if (scanner.hasNextInt()) {
			inputId = scanner.nextInt();	
			scanner.nextLine();
		} else {
			System.out.println("Nhập sai định dạng");
			return null;
		}
		
		System.out.println("Mời nhập department name: ");
		String departmentName = scanner.nextLine();
		
		Department newDepartment = new Department(inputId, departmentName);
		
		scanner.close();
		
		return newDepartment;
	}
	
	
	
	
	
	
	
	
	
	
}
