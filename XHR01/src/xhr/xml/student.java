package xhr.xml;

public class student {
	private String name;
	private int age;
	private String  hobby;
	@Override
	public String toString() {
		return "student [name=" + name + ", age=" + age + ", hobby=" + hobby + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public student(String name, int age, String hobby) {
		super();
		this.name = name;
		this.age = age;
		this.hobby = hobby;
	}
}
