package backend;

import java.util.Scanner;

public class Exercise2 {
	public void question_5() {
		inputAge();
	}

	private int inputAge() {
		Scanner scn = new Scanner(System.in);
		
		while (true) {
			if (scn.hasNextInt()) {
				int number = scn.nextInt();
				
				if (number < 0 ) {
					System.out.println("Wrong inputing! The age must be greater than 0, please input again.");
				} else {
					return number;
				}
			} else {
				System.out.println("wrong inputing! Please input an age as int, input again.");
			}
			scn.nextLine();
		}
	}
	
	private int inputAgeTryCatch() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			
			try {
				int bien = scanner.nextInt();
				if(bien < 0) {
					System.out.println("Wrong input the number have to more than 0");
				}else {
					return bien;
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Wrong input it have to be number");
				
			} finally {
				scanner.nextLine();
			}
		}
	}

	
}
