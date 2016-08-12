package main.com.chenzhq.builder1;

public abstract class ActorBuilder {

	protected Actor actor = new Actor();
	
	public abstract void buildType();
	public abstract void buildSex();
	public abstract void buildHair();
	public abstract void buildFace();
	
	public Actor build() {
		return actor;
	}
	
}
