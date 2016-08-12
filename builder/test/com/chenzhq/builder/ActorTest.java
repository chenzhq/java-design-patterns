package test.com.chenzhq.builder;

import static org.junit.Assert.*;
import main.com.chenzhq.builder.Actor;
import main.com.chenzhq.builder.ActorBuilder;
import main.com.chenzhq.builder.DevilBuilder;
import main.com.chenzhq.builder.HeroBuilder;

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
}
