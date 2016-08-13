package main.com.chenzhq.builder1;

/**
 * 建造者类 将actor的构造封装在其中一个方法中
 * @ClassName ActorController
 * @author chen
 * @date 2016年8月12日 上午11:11:51
 *	
 */
public class ActorController {

	public Actor construct(ActorBuilder ab) {
		ab.buildType();
		ab.buildSex();
		ab.buildHair();
		ab.buildFace();
		return ab.build();
	}
}
