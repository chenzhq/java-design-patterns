/**
 * 
 */
package main.com.chenzhq.abstractfactory;

/**
 * 兽人王国的城堡
 * @ClassName OrcCastle
 * @author chen
 * @date 2016年8月16日 上午11:11:15
 *	
 */
public class OrcCastle implements Castle {

	@Override
	public String show() {
		return "兽人王国的城堡非常霸气！";
	}

}
