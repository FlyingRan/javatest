package xhr.�̳�;

public class Adog extends Aanimal{
	public String name="gou";
	
	public void eat() {
		System.out.println("chigoushi");
	}
	public void m1() {
		System.out.println(super.name);
		System.out.println(this.name);
		super.eat();
		this.eat();
	}
	public Adog() {
		super("blue");
		System.out.println("���������е��޲ι��췽��");
	}
	
}
