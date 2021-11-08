
public class MethodDemo {

	public static void main(String[] args) {
		calcAge(1996, "Ngoc");


	}
	
	// Khai báo một method 
	public static void calcAge ( int birthYear, String name) {
		int age = 2021 - birthYear;
		System.out.println(name + " " +age);
	}

}
