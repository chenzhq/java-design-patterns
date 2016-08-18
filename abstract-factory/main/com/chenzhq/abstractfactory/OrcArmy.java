package main.com.chenzhq.abstractfactory;

/**
 * 兽人军队
 * @ClassName OraArmy
 * @author chen
 * @date 2016年8月16日 上午11:16:47
 *	
 */
public class OrcArmy implements Army {

	/* 
	 * 兽人军队训练
	 * @see main.com.chenzhq.abstractfactory.Army#Train()
	 */
	@Override
	public String train() {
		return "兽人军队训练……";
	}

}
