package main.com.chenzhq.abstractfactory;

/**
 * 兽人王国…
 * @ClassName OrcKingdomFactory
 * @author chen
 * @date 2016年8月16日 上午11:08:57
 *	
 */
public class OrcKingdomFactory implements KingdomFactory {

	@Override
	public Castle creatCastle() {
		return new OrcCastle();
	}

	@Override
	public King creatKing() {
		return new OrcKing();
	}

	@Override
	public Army creatArmy() {
		return new OrcArmy();
	}

}
