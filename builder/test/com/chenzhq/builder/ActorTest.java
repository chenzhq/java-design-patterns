package test.com.chenzhq.builder;

import static org.junit.Assert.*;
import main.com.chenzhq.builder.Actor;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ActorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Actor actor = new Actor();
		actor.setType("英雄");
		actor.setSex("男");
		actor.setFace("帅");
		actor.setHairstyle("黑色");
		System.out.println(actor.toString());
	}

}
