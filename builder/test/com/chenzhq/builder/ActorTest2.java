package test.com.chenzhq.builder;

import main.com.chenzhq.builder2.ActorBuilder;
import main.com.chenzhq.builder2.DevilBuilder;
import main.com.chenzhq.builder2.HeroBuilder;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ActorTest2 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		ActorBuilder heroBuilder = new HeroBuilder();
		ActorBuilder DevilBuilder = new DevilBuilder();
		System.out.println(heroBuilder.build());
		System.out.println(DevilBuilder.build());
	}

}
