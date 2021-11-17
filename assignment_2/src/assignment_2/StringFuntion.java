package assignment_2;

import entity.Department;

public class StringFuntion {

	public static void main(String[] args) {
		String myString = "    nguyễn   văn  a    ";
		System.out.println("myString equals " + myString + ". Hello there!");
		
		myString = myString.trim();
		
		System.out.println("myString equals " + myString + ". Hello there!");
		
		String[] myStringSplited = myString.split(" ");
		System.out.println();
		int count = 0;
		
		String results = "";
		for (String element : myStringSplited) {
			if (element.startsWith(" ") || element == "") {
				System.out.println("Từ này không hợp lệ ");
			} else {
				count ++;
				String firstLetter = element.substring(0,1).toUpperCase();
				String subString = element.substring(1);
				
				String word = firstLetter + subString;
				results = results + " " + word;
				System.out.println(firstLetter+subString + " Hợp lệ");
			}
		}
		System.out.println("Chuỗi này có "  + count + " từ");
		System.out.println(results.trim());
		
		
//		System.out.println(dept1.equals(dept2));
		
		ex2Q6();
		
	}
	
	public static void ex2Q6() {
		Department dept1 = new Department(1, "department 1");
		Department dept2 = new Department(2, "department 2");
		Department dept3 = new Department(3, "department 3");
		Department dept4 = new Department(4, "department 4");
		Department dept5 = new Department(5, "department 5");
		
		System.out.printf("\t%s\t\t%s %n", "Id", "Department Name");
		
	}

}
