package Run;

import java.util.ArrayList;
import java.util.Scanner;

import entity.News;

public class Program {

	public static void main(String[] args) {
//		News news = new News();
//		Scanner scn = new Scanner(System.in);
//		System.out.println("Mời nhập vào các điểm rating, cách nhau bởi dấu phảy");
//		String input = scn.nextLine();
//		
//		// Xử lý string
//		
//		String[] inputSplited = input.split(","); // {"1","2","3","4","5"} -> {1,2,3,4,5}
//		
//		int[] results = new int[inputSplited.length];
////		for (int i : results) {
////			System.out.println(i);
////		}
//		
//		for (int i = 0; i < inputSplited.length; i++) {
//			int convertedNumber = Integer.parseInt(inputSplited[i]);
//			results[i] = convertedNumber;
//		}
//		
////		for (int i : results) {
////			System.out.println(i);
////		}
//		
//		System.out.println(news.getAuthor());
//		
//		news.calculate(results);
//		
//		System.out.println(news.getAverageRate());		
		
		
		myNews();
		
		
	}

	//Tạo chương trình demo có tên là MyNews
	private static void myNews() {
		
		Scanner scn = new Scanner(System.in);
		boolean isLoop = true;
		ArrayList<News> newslist = new ArrayList<News>();
		do {
			System.out.println("Mời nhập vào chức năng: ");
			System.out.println("1. Insert news");
			System.out.println("2. View list news");
			System.out.println("3. Average rate");
			System.out.println("4. Exit");
			
			if (scn.hasNextInt()) {
				int inputFunction = scn.nextInt();
				switch (inputFunction) {
				case 1:
					System.out.println("Bạn đã chọn chức năng 1. Insert news");
					ArrayList<News> results = insertNews(newslist);
					break;
				case 2:
					System.out.println("Bạn đã chọn chức năng 2. View list news");
					break;
				case 3:
					System.out.println("Bạn đã chọn chức năng 3. Average rate");
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

	private static ArrayList<News> insertNews(ArrayList<News> newslist) {
//		Title, PublishDate, Author, Content sau đó yêu cầu người dùng
//		nhập vào 3 đánh giá để lưu vào Rates.
		
		ArrayList<News> results = new ArrayList<News>();
		Scanner scn = new Scanner(System.in);
		
		boolean isLoop = true;
		int count = newslist.size();
		do {
			System.out.println("Mời nhập Title:");
			String title = scn.nextLine();
			System.out.println("Mời nhập PublishDate:");
			String publishDate = scn.nextLine();
			System.out.println("Mời nhập Author:");
			String author = scn.nextLine();
			System.out.println("Mời nhập Content:");
			String content = scn.nextLine();
			System.out.println("Mời nhập vào các điểm rating, cách nhau bởi dấu phảy:");
			String rates = scn.nextLine();
			
			
		} while (isLoop);
		
		
		
		return null;
	}

}








