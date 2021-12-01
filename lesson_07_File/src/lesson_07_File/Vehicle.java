package lesson_07_File;

import java.io.Serializable;

public class Vehicle implements Serializable {
	public String name;
	public String color;
	public String brand;
	public Vehicle(String name, String color, String brand) {
		super();
		this.name = name;
		this.color = color;
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", color=" + color + ", brand=" + brand + "]";
	}
	
	
}
