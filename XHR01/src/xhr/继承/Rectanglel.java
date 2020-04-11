package xhr.ผฬณะ;

public class Rectanglel {
	private int width;
	private int length;
	public Rectanglel() {
		this(21,6);
	}
	public Rectanglel(int width,int length) {
		this.width=width;
		this.length=length;
	}
	public void setWidth(int width) {
		this.width=width;
	}
	public int getWidth() {
		return this.width;
	}
	public void setLength(int length) {
		this.length=length;
	}
	public int getLength() {
		return this.length;
	}
	public int cycle() {
		return this.length+this.width;
	}
	public int square() {
		return this.length*this.width;
	}
}
