package ex1_agn3;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		//q1Ex1();
//		String myString = "   A  quick brown fox jumbs over the lazy dog   ";
//		System.out.println(q1Ex4(myString));
//		System.out.println(q1Ex4_c2(myString));
		//System.out.println(q10Ex4("KO", "OK"));
		System.out.println(q10Ex4_c2());
	}

	private static boolean q10Ex4_c2() {
		String[] resultList = input_q10Ex4_c2();
		return sub_q10Ex4_c2(resultList[0], resultList[1]);
	}

	private static String[] input_q10Ex4_c2() {
		Scanner scn = new Scanner(System.in);
		System.out.println("String 1 :");
		String string1 = scn.nextLine();
		System.out.println("String 2 :");
		String string2 = scn.nextLine();
		String[] stringList = {string1, string2};
		scn.close();
		return stringList;
	}

	private static boolean sub_q10Ex4_c2(String string1, String string2) {
		if (string1.length() == string2.length()) {
			for (int i = 0; i < string1.length(); i++) { // length = 5 ; i = 1
				int length = string1.length();
				if (string1.charAt(i) != string2.charAt(length - (i+1))) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	private static boolean q10Ex4(String string1, String string2) {
		
		StringBuilder stringBuilder = new StringBuilder(string1);
		
		String resersedString1 = stringBuilder.reverse().toString();
		
		return resersedString1.equals(string2);
	}

	private static int q1Ex4(String myString) {
//		Question 1:
//		Nhập một xâu kí tự, đếm số lượng các từ trong xâu kí tự đó (các từ có
//		thể cách nhau bằng nhiều khoảng trắng );
		int count = 0;
		myString = myString.trim();
		String[] myStringSplited = myString.split(" ");
		
		// đếm số từ trong chuỗi
		for (String string : myStringSplited) {
			if (string != "") {
				count ++;
			}
		}
		return count;
	}
	
	private static int q1Ex4_c2(String myString) {
//		Question 1:
//		Nhập một xâu kí tự, đếm số lượng các từ trong xâu kí tự đó (các từ có
//		thể cách nhau bằng nhiều khoảng trắng );
		int count = 0;
		myString = myString.trim();
		myString = myString.replaceAll("\\s+", " ");
		String[] myStringSplited = myString.split(" ");
		return myStringSplited.length;
	}

	private static void q1Ex1() {
	//	Question 1:
	//	Khai báo 2 số lương có kiểu dữ liệu là float.
	//	Khởi tạo Lương của Account 1 là 5240.5 $
	//	Khởi tạo Lương của Account 2 là 10970.055$
	//	Khai báo 1 số int để làm tròn Lương của Account 1 và in số int đó ra
	//	Khai báo 1 số int để làm tròn Lương của Account 2 và in số int đó ra
	
	float salary1 = 5240.2F;
	float salary2 = 10970.055F;
	int roundedSalary1 = Math.round(salary1);
	int roundedSalary2 = Math.round(salary2);

	//ceil  -> 5241
	//me 	 -> 5240.9	
	//floor -> 5240		
	System.out.println(roundedSalary1 + " " + roundedSalary2);
	}
	
	
	
	

}
