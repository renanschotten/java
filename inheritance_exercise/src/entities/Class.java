package entities;

public class Class {
	private String text;
	private Integer num;
	public Class(String text, Integer num) {
		super();
		this.text = text;
		this.num = num;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
}
