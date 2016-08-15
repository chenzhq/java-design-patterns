package test.com.chenzhq.builder;

import main.com.chenzhq.builder.car.Car;
import main.com.chenzhq.builder.car.CarBuilder;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CarTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		CarBuilder builder = new CarBuilder();
		Car car = builder.setBrand("奔驰").setColor("蓝色").setEngine("6A-6108").setTyre("215/70R15").build();
		System.out.println(car);
	}

}
