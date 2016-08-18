package test.com.chenzhq.abstractfactory;

import main.com.chenzhq.abstractfactory.ElfKingdomFactory;
import main.com.chenzhq.abstractfactory.KingdomFactory;
import main.com.chenzhq.abstractfactory.OrcKingdomFactory;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class KingdomFactoryTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		KingdomFactory orcFactory = new OrcKingdomFactory();
		System.out.println(orcFactory.creatCastle().show());
		System.out.println(orcFactory.creatKing().talk());
		System.out.println(orcFactory.creatArmy().train());
		KingdomFactory elfFactory = new ElfKingdomFactory();
		System.out.println(elfFactory.creatCastle().show());
		System.out.println(elfFactory.creatKing().talk());
		System.out.println(elfFactory.creatArmy().train());
	}

}
