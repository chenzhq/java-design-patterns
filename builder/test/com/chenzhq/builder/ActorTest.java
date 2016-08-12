package test.com.chenzhq.builder;

import main.com.chenzhq.builder1.Actor;
import main.com.chenzhq.builder1.ActorBuilder;
import main.com.chenzhq.builder1.ActorController;
import main.com.chenzhq.builder1.DevilBuilder;
import main.com.chenzhq.builder1.HeroBuilder;

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

	/**
	 *  不使用设计模式 创建actor的方法
	 */
	@Test
	public void test() {
		Actor actor = new Actor();
		actor.setType("英雄");
		actor.setSex("男");
		actor.setFace("帅");
		actor.setHair("黑色");
		System.out.println(actor.toString());
	}

	/**
	 *  创建一个建造者类 不同的actor实现方法不同
	 */
	@Test
	public void test2() {
		ActorBuilder hero = new HeroBuilder();
		hero.buildType();
		hero.buildSex();
		hero.buildHair();
		hero.buildFace();
		ActorBuilder devil = new DevilBuilder();
		devil.buildType();
		devil.buildSex();
		devil.buildHair();
		devil.buildFace();
		
		System.out.println(hero.build().toString());
		System.out.println(devil.build().toString());
	}
	
	/**
	 *  增加一个指挥者类 在该类中可以控制actor的构建过程，通过一个方法返回目标对象
	 */
	@Test
	public void test3() {
		ActorController controller = new ActorController();
		Actor hero = controller.construct(new HeroBuilder());
		Actor devil = controller.construct(new DevilBuilder());
		System.out.println(hero.toString());
		System.out.println(devil.toString());
	}
	
	public void test4() {
		
	}
}
