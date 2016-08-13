package main.com.chenzhq.builder2;

public class HeroBuilder extends ActorBuilder {

	@Override
	public void buildType() {
		actor.setType("英雄");
	}

	@Override
	public void buildSex() {
		actor.setSex("男");
	}

	@Override
	public void buildHair() {
		actor.setHair("黑色");
	}

	@Override
	public void buildFace() {
		actor.setFace("英俊");
	}

}
