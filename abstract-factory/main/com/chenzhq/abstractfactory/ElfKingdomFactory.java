package main.com.chenzhq.abstractfactory;

/**
 * 精灵王国
 * @ClassName ElfKingdomFactory
 * @author chen
 * @date 2016年8月16日 上午11:10:04
 *	
 */
public class ElfKingdomFactory implements KingdomFactory {

	@Override
	public Castle creatCastle() {
		return new ElfCastle();
	}

	@Override
	public King creatKing() {
		return new ElfKing();
	}

	@Override
	public Army creatArmy() {
		return new ElfArmy();
	}

}
