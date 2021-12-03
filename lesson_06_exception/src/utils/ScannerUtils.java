package utils;

import java.util.Scanner;

public class ScannerUtils {
	public static int inputInt(String label, String errorMessage) {
		Scanner sc = new Scanner(System.in);
		System.out.println(label);
		while (true) {
			try {
				return Integer.parseInt(sc.next());
			} catch (Exception e) {
				System.err.println(errorMessage);
			}
		}
	}
	public static float inputFloat(String label, String errorMessage) {
		Scanner sc = new Scanner(System.in);
		System.out.println(label);
		while (true) {
			try {
				return Float.parseFloat(sc.next());
			} catch (Exception e) {
				System.err.println(errorMessage);
			}
		}
	}
	public static double inputDouble(String label, String errorMessage) {
		Scanner sc = new Scanner(System.in);
		System.out.println(label);
		while (true) {
			try {
				return Double.parseDouble(sc.next());
			} catch (Exception e) {
				System.err.println(errorMessage);
			}
		}
	}
	public static String inputString(String label) {
		Scanner sc = new Scanner(System.in);
		System.out.println(label);
		return sc.next();
	}
	
}
