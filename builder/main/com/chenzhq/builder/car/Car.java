package main.com.chenzhq.builder.car;

import java.util.ArrayList;
import java.util.List;

public class Car {

	private String brand;
	private String engine;
	private String tyre;
	private String color;

	public Car(CarBuilder builder) {
		this.brand = builder.getBrand();
		this.engine = builder.getEngine();
		this.tyre = builder.getTyre();
		this.color = builder.getColor();
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getTyre() {
		return tyre;
	}

	public void setTyre(String tyre) {
		this.tyre = tyre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", engine=" + engine + ", tyre=" + tyre
				+ ", color=" + color + "]";
	}


	private List<String> sequence = new ArrayList<String>();

	public void start() {
		sequence.add("汽车启动……");
	}

	public void alarm() {
		sequence.add("汽车鸣笛……");
	}

	public void brake() {
		sequence.add("汽车刹车……");
	}

	public void run() {
		for (String action : sequence) {
			System.out.println(action);
		}
	}
}
