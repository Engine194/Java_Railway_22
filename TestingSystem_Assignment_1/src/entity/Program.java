package entity;




import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import enumerate.PositionName;

public class Program {
	public static void main(String[] args) throws ParseException {
		
		// QUES.2 
		// Tạo file Program.java có chứa main() method và khởi tạo ít nhất 3 đối tượng
		//đối với mỗi table trong java
		
		// Khởi tạo  đối tượng 1st Department
		
		Department deparment1 = new Department();
		deparment1.departmentId = 1;
		deparment1.departmentName = "Marketing";
		
		System.out.println("Department id: " +
		deparment1.departmentId +
		"; Department Name: " + 
		deparment1.departmentName);
		
		// Khởi tạo  đối tượng 2nd Department
		
		Department deparment2 = new Department();
		deparment2.departmentId = 2;
		deparment2.departmentName = "Sale";
		
		System.out.println("Department id: " +
				deparment2.departmentId +
		"; Department Name: " + 
		deparment2.departmentName);
		
		
		// Khởi tạo  đối tượng 3rd Department
		
		Department deparment3 = new Department();
		deparment3.departmentId = 3;
		deparment3.departmentName = "General";
		
		System.out.println("Department id: " +
				deparment3.departmentId +
		"; Department Name: " + 
		deparment3.departmentName);
		
		
		
		
		
		// Khởi tạo đối tượng 1st Position
		Position position1 = new Position();
		position1.positionId = 1;
		position1.positionName =PositionName.DEV;

		System.out.println("Position id: "  +
		 position1.positionId +
		"; Position Name: " + 
		position1.positionName);
		
		// Khởi tạo đối tượng 2nd Position
		Position position2 = new Position();
		position2.positionId = 2;
		position2.positionName =PositionName.PM;

		System.out.println("Position id: "  +
		position2.positionId +
		"; Position Name: " + 
		position2.positionName);
		
		
		// Khởi tạo đối tượng 3rd Position
		
		Position position3 = new Position();
		position3.positionId = 3;
		position3.positionName =PositionName.SCRUM_MASTER;

		System.out.println("Position id: "  +
		position3.positionId +
		"; Position Name: " + 
		position3.positionName);
		
		
		
		
		
		
		
		
		// Khởi tạo đối tượng 1st Group
		Group group1 = new Group();
		group1.groupId = 1;
		group1.groupName = "groupName.DEV";

		System.out.println("Group id: "  +
		group1.groupId +
		"; Group Name: " + 
		group1.groupName);
		
		
		
		// Khởi tạo đối tượng 2nd Group
		Group group2 = new Group();
		group2.groupId = 2;
		group2.groupName = "groupName.TEST";

		System.out.println("Group id: "  +
		group2.groupId +
		"; Group Name: " + 
		group2.groupName);
				
				
				
				
		// Khởi tạo đối tượng 3rd Group
		Group group3 = new Group();
		group3.groupId = 3;
		group3.groupName = "groupName.PM";

		System.out.println("Group id: "  +
			group3.groupId + "; Group Name: " + 
			group3.groupName);
		
		
		
		
		// Khởi tạo đối tượng 1st Account
		Account account1 = new Account();
		account1.accountId = 1;
		account1.email = "huynhthanhthu1@gmail.com";
		account1.fullName = "huynh thanh thu";
		account1.username = "thu123";
		account1.departmentId = deparment1;
		account1.positionId = position1;
		account1.createDate = new Date("2021/10/10");
		account1.groups = new Group[] { group1, group2};
		
//		System.out.println( "accountId  = 	"+ account1.accountId);
//		System.out.println( "email 		= 	"+ account1.email);
//		System.out.println( "username   = 	"+ account1.username);
//		System.out.println( "fullName   = 	"+ account1.fullName);
//		System.out.println( "department name = 	"+ account1.departmentId.departmentName);
//		System.out.println( "position name  = 	"+ account1.positionId.positionName);
//		System.out.println( "createDate = 	"+ account1.createDate);
		
		// Khởi tạo đối tượng 2 Account
		Account account2 = new Account();
		account2.accountId = 2;
		account2.email = "huynthanhthu2@gmail.com";
		account2.fullName = "huynh thanh";
		account2.username = "huynhthanh";
		account2.departmentId = deparment2;
		account2.positionId = position2;
		account2.createDate = new Date("2019/04/10");
		account2.groups = new Group[] { group2, group3};
		
		
//		System.out.println( "accountId  = 	"+ account2.accountId);
//		System.out.println( "email 		= 	"+ account2.email);
//		System.out.println( "username   = 	"+ account2.username);
//		System.out.println( "fullName   = 	"+ account2.fullName);
//		System.out.println( "department = 	"+ account2.departmentId.departmentId);
//		System.out.println( "position   = 	"+ account2.positionId.positionId);
//		System.out.println( "createDate = 	"+ account2.createDate);
		
		
		
		// Khởi tạo đối tượng 3 Account
		Account account3 = new Account();
		account3.accountId = 3;
		account3.email = "huynh thanh thu3@gmail.com";
		account3.fullName = "huynh thu3";
		account3.username = "huynthu3";
		account3.departmentId = deparment3;
		account3.positionId = position3;
		account3.createDate = new Date("2018/12/10");
		account3.groups = new Group[] { group1, group2, group3};
	
	
//		System.out.println( "accountId  = 	"+ account3.accountId);
//		System.out.println( "email 		= 	"+ account3.email);
//		System.out.println( "username   = 	"+ account3.username);
//		System.out.println( "fullName   = 	"+ account3.fullName);
//		System.out.println( "department = 	"+ account3.departmentId.departmentId);
//		System.out.println( "position   = 	"+ account3.positionId.positionId);
//		System.out.println( "createDate = 	"+ account3.createDate);
		
		
		group1.creator = account1;
		group1.accounts = new Account[] {account1, account2};		
		
		group2.creator = account2;
		group2.accounts = new Account[] {account2, account3};
		
		group3.creator = account3;
		group3.accounts = new Account[] {account1, account2, account3};
		
		
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		
//	if (account2.departmentId == null) {
//		System.out.println("[if]Nhan vien nay khong co phong ban");
//	} else {
//		System.out.println("[if]Phong ban cua nhan vien nay la: " +
//				account2.departmentId.departmentName);
//	}
//	System.out.println();
//	System.out.println();
//	
//	String result;
//	System.out.println((account2.departmentId == null) ?
//		"[ternary]Nhan vien nay khong co phong ban" :
//		"[ternary]Phong ban cua nhan vien nay la: " + account2.departmentId.departmentName);
//		
//		
//		
//	int x = 2;
//	
//	switch (x) {
//	case 1:
//		System.out.println("Case 1");
//		break;
//	case 2:
//		System.out.println("Case 2");
////		break;
//	case 3:
//		System.out.println("Case 3");
//		break;
//	default:
//		System.out.println("Default");
//	};
//	
//	
//	switch (x) { // number, string
//	case 1:
//		System.out.println("khong co phong ban");
//		break;
//	default:
//		System.out.println("phong ban " +  account2.departmentId.departmentName);
//	}
//	
//	
//	
//	// In ra cac so tu 1 den 10;
//	
//	System.out.println(1);
//	System.out.println(2);
//	System.out.println(3);
//	System.out.println(4);
//	System.out.println(5);
//	System.out.println(6);
//	System.out.println(7);
//	System.out.println(8);
//	System.out.println(9);
//	System.out.println(10);
//	System.out.println();
//	System.out.println();
//	
//	for (int i = 1; i < 10; i = i + 2) { // 10
//		System.out.println(i + 1);
//	}	
//	
//	// i++ <=> i = i + 1;
//	// i-- <=> i = i - 1;
//	
//	
//	
//	
//	// In ra cac so chia het cho 4 ma <= 20;
//	// Cach 1
//	System.out.println(0);
//	System.out.println(4);
//	System.out.println(8);
//	System.out.println(12);
//	System.out.println(16);
//	System.out.println(20);
//	// Cach 2
//	System.out.println();
//	for (int i = 0; i <= 20; i++) {
//		if (i % 4 == 0) {
//			System.out.println(i);
//		}
//	}
//	// Cach 3
//	for (int i = 0; i <= 20; i = i + 4) {
//		System.out.println(i);
//	}
//	
//	
//	
//	
//	// khai bao mot mang co datatype la String
//	
//	// Array
//	
//	String[] fruits = { "Lemon", "Kiwi", "Orange", "Banana"};
//	
//	// In ra tat ca cac phan tu trong mang fruits
//	
//	for (String fruit : fruits) {
//		System.out.println(fruit);
//	}
//	
//	String[] students = {"Duy", "A Thự"};
//	
//	System.out.println();
//	System.out.println();
//	System.out.println();
//	System.out.println();
//	
//	
//	
//	
//	int i = 0;
//	
//	while (i < 10) {
//		System.out.println(i + 1 + "truoc khi tang");
//		i++;
//		System.out.println(i + 1 + "sau khi tang");
//	};
//	
//	
//	
//	int i1 = 0;
//	
//	do {
//		System.out.println(i1 + 1);
//		i1++;
//	} while ( i1 < 10);
//	
//	
//	
//	int y = 1;
//	int z;
//	
//	// z = y ++;
//	
////	z = y;
////	y = y + 1;
//	
////	z = ++y;
//	
//	y = y + 1;
//	z = y;
//	
//	System.out.println("z = " + z);
//	
//	
//	
//	
//	
//	
//	int a = 10; // máy sẽ tạo 1 vùng ổ nhớ có địa chỉ là #001
//	// bên trong ô nhớ #001 đó sẽ lưu giá trị của biến a, ở đây giá trị là 10;
//	int b = 10; // máy sẽ tạo 1 vùng ổ nhớ có địa chỉ là #002
//	// bên trong ô nhớ #002 đó sẽ lưu giá trị của biến b, ở đây giá trị là 11;
//	System.out.println(a == b); // 100 == 11;
//	a += 2;
//	
//	System.out.println(a);
	
// Question 4 Ex 1 assign 2
		
 	System.out.println(account1.positionId.positionName == PositionName.DEV ? 
			"Day la Dev" :
			"Nguoi nay ko phai DEV");
// Phuong thuc length cho 1 array
 	// group1.accounts;
 	int[] listNums = { 1, 2, 4, 8 };
 	
// 	int numberAccGroup1 = 0;
// 	for (Account account : group1.accounts) {
// 		numberAccGroup1 ++;
//	}
	
 	// System.out.println("Group 1 has " + numberAccGroup1 + " accounts");

 	
 	// Question 5:
 	
 	int numberAccGroup1 = group1.accounts.length; 
	switch (numberAccGroup1) {
	case 1:
		System.out.println("Nhóm có một thành viên");
		break;
	case 2:
		System.out.println("Nhóm có hai thành viên");
		break;
	case 3:
		System.out.println("Nhóm có ba thành viên");
		break;
	default:
		System.out.println("Nhóm có nhiều thành viên");
		break;
	}
	
	
	// Question 8:
	
	Account[] listAccounts = {account1, account2, account3};
	
	for (int i = 0; i < listAccounts.length; i=i+1) {
		System.out.println( "accountId  = 	"+ listAccounts[i].accountId);
		System.out.println( "email 		= 	"+ listAccounts[i].email);
		System.out.println( "username   = 	"+ listAccounts[i].username);
		System.out.println( "fullName   = 	"+ listAccounts[i].fullName);
		System.out.println( "department = 	"+ listAccounts[i].departmentId.departmentName);
		System.out.println( "position   = 	"+ listAccounts[i].positionId.positionId);
		System.out.println( "createDate = 	"+ listAccounts[i].createDate);
		System.out.println();
	}	
	// foreach
	for (Account element : listAccounts) {
		System.out.println( "accountId  = 	"+ element.accountId);
		System.out.println( "email 		= 	"+ element.email);
		System.out.println( "username   = 	"+ element.username);
		System.out.println( "fullName   = 	"+ element.fullName);
		System.out.println( "department = 	"+ element.departmentId.departmentName);
		System.out.println( "position   = 	"+ element.positionId.positionId);
		System.out.println( "createDate = 	"+ element.createDate);
		System.out.println();
	}
	
	
	// Question 11: in ra departments
	// Forloop = 1. for i ( dùng 1 biến chạy để lọc qua tất cả các phần tử);
	//		2. foreach (lọc qua tất cả các phần tử)
	Department[] listDepartments = {deparment1, deparment2, deparment3};
	for (Department element : listDepartments) {
		System.out.println("Thông tin department thứ "+ element.departmentId +" là:\r\n"
				+ "\tId: "+ element.departmentId +"\r\n"
				+ "\tName: "+ element.departmentName +"\r");
	}
	
//	String pattern = "dd/MM/yyyy HH'h':mm'p':ss's'";
//	SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
//	Date today = new Date();
//	String date = simpleDateFormat.format(today);
//	System.out.println(date);
	System.out.println();
	Scanner scanner = new Scanner(System.in);
	
//	System.out.println("What is your birth year?");
//	if (scanner.hasNextInt()) {
//		int birthYear = scanner.nextInt();
//		int age = 2021 - birthYear;
//		System.out.println("You are " + age + " years old.");
//	} else {
//		System.out.println("Invalid");
//	}
//	scanner.nextLine();
//	System.out.println("What's your name?");
//	String name = scanner.nextLine();
//	System.out.println("Welcome " + name);
//	String dateInputString = scanner.nextLine();
//	String pattern = "dd-MM/yyyy HH-mm-ss";
//	SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
//	Date dateInputDate = simpleDateFormat.parse(dateInputString);
//	System.out.println("Output " + dateInputDate);
	
	
	// Bai Lesson 3
	
	// implicitly
	
	int num = 10;
	
	long numLong = num;
	
	System.out.println(numLong);
	
	
	// explicitly
	
	long otherNumLong = 10L;
	
	int otherNum = (int) otherNumLong;
	
	int minI = Integer.MIN_VALUE;
	int maxI = Integer.MAX_VALUE;
	
	long l = maxI + 4L;
	
	System.out.println("l = " + l);
	
	int i = (int) l;
	System.out.println("MaxI = " + maxI);
	System.out.println("Gia tri cua i = " + i + " (min integer = " + minI);
	
	
	// ep kieu cho float
	
	int a = 1;
	int b = 2;
	
	float c = (float) a / b;
	System.out.println("c = " + c);
	
	boolean[] points = new boolean[5];
	
	for (boolean j : points) {
		System.out.println("element = " + j);
	}
	// byte -> Byte
	byte myByte = Byte.MAX_VALUE;
	
	String myNumberString = "10";
	int myNumberInt = 10;
	
	System.out.println("myNumberString = " + myNumberString);
	System.out.println("myNumberInt = " + myNumberInt);
	
	int convertedNumber = Integer.parseInt("10"); // convertedNumber = 10
	
	System.out.println( convertedNumber + 10); // 10 + 10
	
	
	String a1 = new String ("Nguyen");
	
	// Tạo một phân vùng bộ nhớ có địa chỉ là #000101,
	// bên trong chứa giá trị "Nguyen" rồi gán giá trị của a1 = #000101
	
	// a1 coi như 1 chiếc hộp, bên ngoài có nhãn #000101,
	// mở ra thì chứa một chuỗi "Nguyen";
	
	String b1 = "Nguyen";
	
	// Tạo một phân vùng bộ nhớ có địa chỉ là #000102,
	// bên trong chứa một giá trị "Nguyen"
	
	// b1 coi như tờ giấy , bên trên có ghi "Nguyen",
	System.out.println("a1 = " + a1);
	System.out.println("b1 = " + b1);
	System.out.println(a1 == b1);
	
	// so sánh value của a1 và b1
	// 01-01-1970
	
	// a1 được coi như một object, và value của a1 sẽ là địa chỉ ô nhớ trỏ tới   
	
	String c1 = new String("Nguyen");
	String d1 = new String("Nguyen");
	System.out.println("so sanh c1, d1");
	System.out.println(c1 == d1);
	System.out.println(c1.equals(d1));
	
	Date date1 = new Date(100, 01, 01);  // 2000
	Date date2 = new Date(100, 01, 01);
	// strict
	System.out.println(date1 == date2);
	
	// đặt 1 biến t1 = thời gian kể từ date1 cho tới mốc epochday (01-01-1970)
	// đặt 1 biến t2 = thời gian kể từ date2 cho tới mốc epochday (01-01-1970)
	
	// so sánh t1 với t2
	
	Account[] accounts = new Account[5];
	// accounts[0], accounts[1] ... accounts[4]
	for (int j = 0; j < accounts.length; j++) {
		accounts[j] = new Account();
		accounts[j].accountId = j + 3;
		accounts[j].fullName = "Trí  " + (j+3);
	}
	
	for (Account account : accounts) {
		System.out.println("id: " + account.accountId);
		System.out.println("fullname: " + account.fullName);
	}
	
	int x1 = 100;
	Integer y1 = Integer.valueOf(x1);
	
	System.out.println(x1);
	System.out.println(y1 + 5);
	
	
	
	Integer y2 = new Integer(101);
	int x2 = 101;
	
	
	System.out.println(y2 + 5);
	System.out.println(x2 + 5);
	
	System.out.println(y2 == x2);
	
	System.out.println(deparment1.toString());
	
	
	}
	
	

	
}
