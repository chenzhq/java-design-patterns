package main.com.chenzhq.abstractfactory;

public class ElfArmy implements Army {

	/* 
	 * 精灵军队训练
	 * @see main.com.chenzhq.abstractfactory.Army#Train()
	 */
	@Override
	public String train() {
		return "精灵军队训练……";
	}

}
