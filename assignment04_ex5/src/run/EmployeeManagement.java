package run;

import java.util.ArrayList;
import java.util.Scanner;

import entity.Employee;
import entity.Engineer;
import entity.Staff;
import entity.Worker;
import enumerate.Gender;

public class EmployeeManagement {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean isLoop = true;
		ArrayList<Employee> employeelist = new ArrayList<Employee>();
		do {
			System.out.println("Mời nhập vào chức năng: ");
			System.out.println("1. Insert employee");
			System.out.println("2. Find by fullname");
			System.out.println("3. Delete by fullname");
			System.out.println("4. Exit");
			
			if (scn.hasNextInt()) {
				int inputFunction = scn.nextInt();
				scn.nextLine();
				switch (inputFunction) {
				case 1:
					System.out.println("Bạn đã chọn chức năng 1. Insert employee");
					ArrayList<Employee> employeeResultList = createEmployee();
					for (Employee employee : employeeResultList) {
						employeelist.add(employee);
					}
					for (Employee employee : employeelist) {
						System.out.println(employee.toString());
					}
					break;
				case 2:
					System.out.println("Bạn đã chọn chức năng 2. Find by fullname");
					System.out.println("Mời nhập vào fullname cần tìm");
					String search = scn.nextLine();
					ArrayList<Employee> found = new ArrayList<Employee>();
					for (Employee employee : employeelist) {
						if (employee.getFullname().equals(search)) {
							found.add(employee);
						}
					}
					
					for (Employee employee : found) {
						System.out.println(employee.toString());
					}
					break;
				case 3:
					// Tính điểm trung bình của tất cả các tin tức
					System.out.println("Bạn đã chọn chức năng 3. Delete by fullname");
					
					System.out.println("Mời nhập vào fullname cần xóa");
					String delete = scn.nextLine();
					
					for (int i = 0; i < employeelist.size(); i++) {
						if (employeelist.get(i).getFullname().equals(delete)) {
							employeelist.remove(i);
							i --;
						}
					}
					System.out.println("Đã xóa thành công !");
					break;
				default:
					System.out.println("Exit!");
					scn.close();
					return;
				}
			} else {
				System.out.println("Nhập sai, mời nhập lại!!!");
				scn.nextLine();
				continue;
			}
//			System.out.println(" This code is run ");
			
			
		} while (isLoop);
		System.out.println(" after do while is run ");
		scn.close();
	}

	private static ArrayList<Employee> createEmployee() {
		ArrayList<Employee> results = new ArrayList<Employee>();
		Scanner scn = new Scanner(System.in);
		
		do {
			System.out.println("Mời nhập fullname:");
			String fullname = scn.nextLine();
			System.out.println("Mời nhập age:");
			int age = scn.nextInt();
			scn.nextLine();
			System.out.println("Mời nhập gender: (1: Male, 2: Female, 3: Unknown");
			int gender = scn.nextInt();
			scn.nextLine();
			Gender genderObject = null;
			
			switch (gender) {
			case 1:
				genderObject = Gender.MALE;
				break;
			case 2:
				genderObject = Gender.FEMALE;
				break;
			default:
				genderObject = Gender.UNKNOWN;
				break;
			}
			
			System.out.println("Mời nhập address:");
			String address = scn.nextLine();
			System.out.println();
			System.out.println("Nhân viên này là:");
			System.out.println("1. Worker ?");
			System.out.println("2. Engineer ?");
			System.out.println("3. Staff ?");
			int employeeType = scn.nextInt();
			scn.nextLine();
			System.out.println();
			Employee employee = new Employee(fullname, age, genderObject, address);
			switch (employeeType) {
			case 1:
				System.out.println("Mời nhập vào level:");
				int level = scn.nextInt();
				scn.nextLine();
				// Khởi tạo một Worker
				Worker worker = new Worker(employee, level);
//				Worker worker = new Worker(fullname, age, genderObject, address, level);
				results.add(worker);
				break;
			case 2:
				System.out.println("Mời nhập vào traing:");
				String training = scn.nextLine();
				// Khởi tạo một Engineer
				Engineer engineer = new Engineer(employee, training);
				results.add(engineer);
				break;
			case 3:
				System.out.println("Mời nhập vào work:");
				String work = scn.nextLine();
				// Khởi tạo một Staff
				Staff staff = new Staff(employee, work);
				results.add(staff);
				break;
			default:
				break;
			}
			System.out.println("Tạo thành công !");
			System.out.println();
			
			System.out.println("Bạn có muốn tiếp tục insert employee không?");
			System.out.println("Y - yes");
			System.out.println("N - no");
			String answer = scn.nextLine();
			System.out.println();
			if (answer.toLowerCase().equals("y")) { // Y -> true | y -> true
				continue;
			} 
			return results;
			
			
		} while (true);		
	}

}
