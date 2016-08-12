package main.com.chenzhq.builder;

public class DevilBuilder extends ActorBuilder {

	@Override
	public void buildType() {
		actor.setType("恶魔");
	}

	@Override
	public void buildSex() {
		actor.setSex("女");
	}

	@Override
	public void buildHair() {
		actor.setHair("白色");
	}

	@Override
	public void buildFace() {
		actor.setFace("美丽");
	}

}
