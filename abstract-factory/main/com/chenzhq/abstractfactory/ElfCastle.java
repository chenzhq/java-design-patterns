/**
 * 
 */
package main.com.chenzhq.abstractfactory;

/**
 * 精灵王国的城堡
 * @ClassName ElfCastle
 * @author chen
 * @date 2016年8月16日 上午11:19:31
 *	
 */
public class ElfCastle implements Castle {

	/* (non-Javadoc)
	 * @see main.com.chenzhq.abstractfactory.Castle#show()
	 */
	@Override
	public String show() {
		return "精灵王国的城堡非常漂亮！";
	}

}
