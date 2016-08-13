package test.com.chenzhq.builder;

import main.com.chenzhq.builder.mediaplayer.Player;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PlayerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Player fullPlayer = new Player.Builder().setWin("大窗体").setMenu("简洁菜单").setList("详细列表").setBar("进度条").build();
		System.out.println(fullPlayer.toString());
	}

}
