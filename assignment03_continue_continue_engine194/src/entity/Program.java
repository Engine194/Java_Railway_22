package entity;

import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		String[] nameList = {"Waiting room", "Accounting", "Marketing", "Boss of director", "Sale", "Security"};
//		Question 6: Khởi tạo 1 array phòng ban gồm 5 phòng ban, sau đó in ra danh
//		sách phòng ban theo thứ tự tăng dần theo tên (sắp xếp theo vần ABCD)
//		VD:
//		Accounting
//		Boss of director
//		Marketing
//		Sale
//		Waiting room
		ex6q6(nameList);

		System.out.println();
//		Question 7: Khởi tạo 1 array học sinh gồm 5 Phòng ban, sau đó in ra danh
//		sách phòng ban được sắp xếp theo tên
//		VD:
//		Accounting
//		Boss of director
//		Marketing
//		waiting room
//		Sale
		ex6q7(nameList);
		
	}
	
	// Ex7 Question 7
	private static void ex6q7(String[] nameList) {
		// 1.Khởi tạo 1 array phòng ban gồm 5 phòng ban
		createDepartments(nameList);
		// 2. In ra danh sách phòng ban được sắp xếp theo tên (từ cuối)
		printSortByAlphabetAll(nameList, 7);
	}

	// Ex6 Question 6
	private static void ex6q6(String[] nameList) {
		// 1.Khởi tạo 1 array phòng ban gồm 5 phòng ban
		createDepartments(nameList);

		// 2. sau đó in ra danh sách tên phòng ban theo thứ tự tăng dần theo tên
		// (sắp xếp theo vần ABCD)
		printSortByAlphabetAll(nameList, 6);
		
	}
	
	private static ArrayList<Department> createDepartments(String[] nameList) {
		ArrayList<Department> departments = new ArrayList<Department>();
		
		for (int i = 0; i < nameList.length; i++) {
			Department department = new Department(i+1, nameList[i]);
			departments.add(department);
		}
		return departments;
	}
	
	private static void printSortByAlphabetAll(String[] nameList, int questionNum) {
		ArrayList<String> results = new ArrayList<String>();

		String prevousMin = "";
		
		String[] previousArr = nameList;

		// 2.3. Lặp for i chạy từ 0 tới nameList.length
		for (int i = 0; i < nameList.length; i++) {

			// 2.3.1. Lấy ra phần từ đầu tiên phía bên trái trục số khác prevousMin
			// L2. remove phần tử == previousMin khỏi previousArr
			String[] removedArr = removeStringList(previousArr, prevousMin);
			String minValue = "";
			switch (questionNum) {
			case 6:
				minValue = getMinElement(removedArr);
				break;
			case 7:
				minValue = getMinElementByWord(removedArr);
				break;
			default:
				System.out.println("Wrong question number");
				return;
			}
			//= 

			// 2.3.2. Ném phần từ đó vào trong results
			results.add(minValue);

			// 2.3.3. Gán prevousMin = minValue;
			prevousMin = minValue;
			previousArr = removedArr;
		}

		// 2.4. In ra kết quả
		for (String string : results) {
			System.out.println(string);
		}
	}
	
	
	// L1: Lấy ra phần tử đầu tiên phía bên trái trục số
	private static String getMinElement(String[] input ) {
		if (input.length > 0) {
			String minVal = input[0];
			
			for (int i = 1; i < input.length; i++) {
				String element = input[i];
				// So sánh phần tử thứ i < minValue
				// --- <phần tử thứ hai> ở đây? --- minValue --- <phần tử thứ hai> hay ở đây? --->
				if (element.compareToIgnoreCase(minVal) < 0) {
					minVal = element;
				}
			}
			return minVal;
		}
		return "";
	}
	
	// L1 của Question 7 ex 6
	private static String getMinElementByWord(String[] input) {
		if (input.length > 0) {
			String minVal = input[0];
			for (int i = 1; i < input.length; i++) {
				String[] elementSplited = input[i].split(" ");
				String[] minValSplited = minVal.split(" ");
				String lastWordElement = elementSplited[elementSplited.length - 1];
				String lastWordMinVal = minValSplited[minValSplited.length - 1];
				if (lastWordElement.compareToIgnoreCase(lastWordMinVal) < 0) {
					minVal = input[i];
				}
			}
			return minVal;
		}
		return "";
	}
	
	// L2. remove phần tử == element ra khỏi mảng input và trả về mảng đó
	private static String[] removeStringList(String[] input, String element) {
		ArrayList<String> strings = new ArrayList<String>();
		for (int i = 0; i < input.length; i++) {
			String string = input[i];
			if (!string.equals(element)) {
				strings.add(string);
			}
		}
		String[] inputSize = new String[input.length - 1];
		return strings.toArray(inputSize);
	}
			
}
