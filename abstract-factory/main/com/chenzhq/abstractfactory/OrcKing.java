/**
 * 
 */
package main.com.chenzhq.abstractfactory;

/**
 * 兽人国王
 * @ClassName OraKing
 * @author chen
 * @date 2016年8月16日 上午11:15:35
 *	
 */
public class OrcKing implements King {

	/* (non-Javadoc)
	 * @see main.com.chenzhq.abstractfactory.King#talk()
	 */
	@Override
	public String talk() {
		return "兽人国王演讲！";
	}

}
