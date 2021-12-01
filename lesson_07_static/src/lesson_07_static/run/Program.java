package lesson_07_static.run;

import lesson_07_static.entity.Student;

public class Program {

	public static void main(String[] args) {
		// 1. gặp keyword new, tạo phân vùng bộ nhớ mới
		// 2. chạy phương thức khởi tạo
		// 3. return về địa chỉ ô nhớ , vd : #0000001;
		// student1 = #0000001;
		// Q1
		Student student1 = new Student(1, "Nguyen Van A"); // student1 = #001;
		Student student2 = new Student(2, "Nguyen Van B");
		Student student3 = new Student(3, "Nguyen Van C");
		
		Student[] studentList = {student1, student2, student3};
	
		Student.setCollege("Đại học Bách khoa");
		
		for (Student student : studentList) {
			System.out.println(student.toString());
		}
		
		Student.setCollege("Đại học Công nghệ");
		
		for (Student student : studentList) {
			System.out.println(student.toString());
		}
		
		// Q2
		// B1: thu quỹ mỗi người 100k;
		for (Student student : studentList) {
			student.dongQuy(100000);
		}
		
		System.out.println(Student.getMoneyGroup());
		
		
	}

}
