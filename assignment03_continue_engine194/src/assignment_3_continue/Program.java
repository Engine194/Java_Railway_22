package assignment_3_continue;

import java.util.ArrayList;

import entity.Department;

public class Program {

	public static void main(String[] args) {
//		Question 16 (Optional):
//		Cho một chuỗi str và số nguyên n >= 0. Chia chuỗi str ra làm các phần
//		bằng nhau với n ký tự. Nếu chuỗi không chia được thì xuất ra màn
//		hình “KO”.
		
//		ArrayList<String> myResult = splitStringByN("Hel", 4);		
//		for (String string : myResult) {
//			System.out.println(string);
//		}
		
//		Question 6: Khởi tạo 1 array phòng ban gồm 5 phòng ban, sau đó in ra danh
//		sách phòng ban theo thứ tự tăng dần theo tên (sắp xếp theo vần ABCD)
//		VD:
//		Accounting
//		Boss of director
//		Marketing
//		Sale
//		Waiting room
		
		
		String[] nameList = {"Accounting","Boss of director","Marketing","Sale","Waiting room"};
		ArrayList<Department> departmentList = new ArrayList<Department>();
		for (int i = 0; i < nameList.length; i++) {
			Department department = new Department(i + 1, nameList[i]);
			departmentList.add(department);
		}
		
		
		int test = "Boss of director".compareToIgnoreCase("Boss of HR");
		System.out.println(test);
		
		
		int[] myIntList = {1,3,4,5,2};
		ArrayList<Integer> myOrderedIntegerList = q6Ex5_Integer(myIntList);
		for (Integer integer : myOrderedIntegerList) {
			System.out.println(integer);
		}
	}
	
	private static ArrayList<Integer> q6Ex5_Integer(int[] myIntList) {
		ArrayList<Integer> myIntegerList = new ArrayList<Integer>();
		ArrayList<Integer> myIntegerResultList = new ArrayList<Integer>(); // {}
		// convert from array to ArrayList
		for (int i : myIntList) {
			myIntegerList.add(i);
		}
		
		for (int i = 0; i < myIntList.length; i++) {
			// 1. Đi tìm min
			int myMin = findMin(myIntegerList);
			
			// 2. Xóa min vừa tìm đc khỏi myIntegerList
			for (int j = 0; j < myIntegerList.size(); j++) {
				if (myIntegerList.get(j) == myMin) {
					myIntegerList.remove(j);
					j --;
				}
			}
			
			// 3. Đẩy min vừa tìm đc vào chuỗi kết quả
			myIntegerResultList.add(myMin); 
		}
		
		return myIntegerResultList;
	}
	
	private static Integer findMin(ArrayList<Integer> intList) { // intList = {1,3,4,2,5}
		if (intList.size() > 0) {
			int myInt = intList.get(0);
			for (int i = 0; i < intList.size(); i++) { // i = 4
				int element = intList.get(i); // element = 5
				if (element < myInt) { // 5 > 4 -> myInt = 5;
					myInt = element;
				}
			}
			return myInt;
		}
		else {
			return -1;
		}
	}
	
	
	// Chặt string ra thành những phần tử có i ký tự
	private static ArrayList<String> splitStringByN(String input, int n) {
		
		// 1. Tạo một ArrayList để hứng kết quả.
		ArrayList<String> resultList = new ArrayList<String>();
		
		// 2. Sử dụng vòng for để chặt chuỗi. i = 0, 4, 8 
		for (int i = 0; i < input.length(); i = i + n) { // input = "Hello world", n = 4 -> {"Hell","o wo","rld"}
			if (i + n > input.length() - 1) { // 8 + 4 > 11 - 1 <-> 12 > 10 <-> true
				String myString_1 = input.substring(i); // myString = "rld";
				resultList.add(myString_1);
				break;
			}
			String myString_2 = input.substring(i, i + n); // substring(0, 4) ->myString = "o wo"; index= 0, 1, 2, 3, ... 10
			resultList.add(myString_2); // resultList = {"Hell", "o wo"};
		}
		
		
		return resultList;
	}

}
