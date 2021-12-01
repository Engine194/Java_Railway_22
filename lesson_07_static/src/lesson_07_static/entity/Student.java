package lesson_07_static.entity;

public class Student {
	private static int moneyGroup = 0;
	private static String college;
	private int id;
	private String name;
	
	public Student (int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Student () {
		super();
	}

	public static String getCollege() {
		return college;
	}

	public static void setCollege(String college) {
		Student.college = college;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getMoneyGroup() {
		return moneyGroup;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", college ="+ Student.college+"]";
	}

	public void dongQuy (int amount) {
		moneyGroup += amount;
	}

	public void lienHoan (int amount) {
		moneyGroup -= amount;
	}
	
	public void muaBanhMi (int amount) {
		moneyGroup -= amount;
	}
	
	public void muaDoDungHT (int amount) {
		moneyGroup -= amount;
	}
}
