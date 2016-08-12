package main.com.chenzhq.builder;


public class Actor {

	private String type;
	private String sex;
	private String hair;
	private String face;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getHair() {
		return hair;
	}
	public void setHair(String hairstyle) {
		this.hair = hairstyle;
	}
	public String getFace() {
		return face;
	}
	public void setFace(String face) {
		this.face = face;
	}
	
	@Override
	public String toString() {
		return "英雄类型：" + type 
				+ "\n性别："+ sex 
				+ "\n头发：" + hair 
				+ "\n颜值：" + face;
	}
	
	
}
