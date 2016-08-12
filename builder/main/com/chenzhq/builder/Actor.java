package main.com.chenzhq.builder;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Actor {

	private String type;
	private String sex;
	private String hairstyle;
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
	public String getHairstyle() {
		return hairstyle;
	}
	public void setHairstyle(String hairstyle) {
		this.hairstyle = hairstyle;
	}
	public String getFace() {
		return face;
	}
	public void setFace(String face) {
		this.face = face;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
	
}
