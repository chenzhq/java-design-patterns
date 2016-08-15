package main.com.chenzhq.builder.car;

public class CarBuilder {

	private String brand;
	private String engine;
	private String tyre;
	private String color;

	public CarBuilder setBrand(String brand) {
		this.brand = brand;
		return this;
	}

	public CarBuilder setEngine(String engine) {
		this.engine = engine;
		return this;
	}

	public CarBuilder setTyre(String tyre) {
		this.tyre = tyre;
		return this;
	}

	public CarBuilder setColor(String color) {
		this.color = color;
		return this;
	}
	
	
	public String getBrand() {
		return brand;
	}

	public String getEngine() {
		return engine;
	}

	public String getTyre() {
		return tyre;
	}

	public String getColor() {
		return color;
	}

	public Car build() {
		return new Car(this);
	}

}
