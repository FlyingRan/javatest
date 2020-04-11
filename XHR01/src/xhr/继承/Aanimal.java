package xhr.继承;

public class Aanimal {
	public String name="dongwu";
	String coloar;
	public Aanimal() {
		System.out.println("这是父类中的无参构造方法 ");
	}
	public void eat() {
		System.out.println("chifan");
	}
	public void m3() {
		System.out.println("1");
	}
	public Aanimal(String coloar) {
			this.coloar=coloar;
	}
	
}
