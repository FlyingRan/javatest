package xhr.object;

public class te {
	public void text(Bird bird) {
		System.out.println(bird.getName()+"ÄÜ¹»·É"+bird.fly()+"m");
	}
	public static void main(String[] args) {
		te t = new te();
		t.text(new Bird() {

			@Override
			public int fly() {
				return 100;
			}

			@Override
			public void setName(String name) {
				super.setName(name);
			}

			@Override
			public String getName() {
				return "xhr";
			}
			
		});
	}

}
abstract class Bird{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public abstract int fly();
}