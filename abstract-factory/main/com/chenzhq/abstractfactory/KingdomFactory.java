package main.com.chenzhq.abstractfactory;

public interface KingdomFactory {

	/**
	 * 建造城堡
	 * @return Castle
	 */
	public Castle creatCastle();
	
	/**
	 * 选举国王
	 * @return King
	 */
	public King creatKing();
	
	/**
	 * 招募军队
	 * @return Army
	 */
	public Army creatArmy();
}
