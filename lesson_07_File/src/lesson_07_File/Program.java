package lesson_07_File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Program {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String path = "F:\\Raiwaily22\\Java_Railway_22\\testLesson7.txt";
		File file = new File(path);
		
		if (file.isDirectory()) {
			System.out.println("This path is directory");
			System.out.println();
			// In ra tên các item name có trong tệp
			for (String name : file.list()) {
				System.out.println(name);
			}
			
		} else {
			System.out.println("This path is a file");
			
			// Đọc file
//			FileInputStream fileInputStream = new FileInputStream(path);
//			byte[] byteList = new byte[1362];
//			int length = fileInputStream.read(byteList);
//			System.out.println(length);
//			
//			while (length > -1) {
//				String content = new String(byteList, 0, length);
//				System.out.println(content);
//				System.out.println();
//				length = fileInputStream.read(byteList);
//			}
//			fileInputStream.close();
			// Viết file
//			FileOutputStream fileOutputStream = new FileOutputStream(path, false);
//			
//			fileOutputStream.write("\nRailway_20_22".getBytes());
//			fileOutputStream.close();
		}
		
		String pathObject = "F:\\\\Raiwaily22\\\\Java_Railway_22\\object.ser";
//		Vehicle crv = new Vehicle("CRV", "Grey", "Honda");
//		
//		FileOutputStream fileOutputStream = new FileOutputStream(pathObject);
//		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//		
//		objectOutputStream.writeObject(crv);
//		objectOutputStream.close();
		
		
		FileInputStream fileInputStream = new FileInputStream(pathObject);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		
		Object object = objectInputStream.readObject();		
		
		Vehicle vehicle = (Vehicle) object;
		System.out.println(vehicle);
		
	} 

}
