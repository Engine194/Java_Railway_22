package Run;

import java.util.ArrayList;
import java.util.Scanner;

import entity.News;

public class Program {

	public static void main(String[] args) {
//		News news = new News(1, "title1", "24.11.2021", "engine194", "content1", 0.0f);
//		System.out.println(news.toString());
		
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
					for (News news : results) {
						newslist.add(news);
					}
					break;
				case 2:
					System.out.println("Bạn đã chọn chức năng 2. View list news");
					for (News news : newslist) {
						System.out.println(news.toString());
					}
					break;
				case 3:
					// Tính điểm trung bình của tất cả các tin tức
					System.out.println("Bạn đã chọn chức năng 3. Average rate");
					float totalRating = 0.0f;
					for (News news : newslist) {
						totalRating += news.getAverageRate();
					}
					System.out.println("Average rate = " + totalRating / (newslist.size() > 0 ? newslist.size() : 1));
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
		
		int count = newslist.size();
		int index = 1;
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
			String rates = scn.nextLine(); // "1,2,3,4,5,6"
			System.out.println();
			// Convert rates to int[]
			String[] stringRates = rates.split(","); // {"1","2","3","4","5"} -> {1,2,3,4,5}
			int[] intRates = new int[stringRates.length];
			for (int i = 0; i < stringRates.length; i++) {
				int convertedNumber = Integer.parseInt(stringRates[i]);
				intRates[i] = convertedNumber;
			}
			// Create instance
			News news = new News(count + index, title, publishDate, author, content, 0.0f);
			news.calculate(intRates);
			// push into results
			results.add(news);
			System.out.println("Success !");
			System.out.println();
			System.out.println("Bạn có muốn tiếp tục tạo News ?");
			System.out.println("Y - yes");
			System.out.println("N - no");
			String answer = scn.nextLine();
			System.out.println();
			if (answer.toLowerCase().equals("y")) { // Y -> true | y -> true
				index ++;
			} else {
				return results;
			}
			
		} while (true);
	}

}








