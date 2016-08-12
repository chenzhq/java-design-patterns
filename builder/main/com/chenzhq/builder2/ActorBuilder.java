package main.com.chenzhq.builder2;

/**
 * 这种实现不影响系统的灵活性和可扩展性，同时还简化了系统结构，但加重了抽象建造者类的职责，
 * 如果build()方法较为复杂，待构建产品的组成部分较多，建议还是将build()方法单独封装在Controller中，这样做更符合“单一职责原则”。
 * @ClassName ActorBuilder
 * @author chen
 * @date 2016年8月12日 下午11:53:03
 *	
 */
public abstract class ActorBuilder {

	protected static Actor actor = new Actor();
	
	public abstract void buildType();
	public abstract void buildSex();
	public abstract void buildHair();
	public abstract void buildFace();
	
	public Actor build() {
		this.buildType();
		this.buildSex();
		this.buildHair();
		this.buildFace();
		return actor;
	}
	
}
