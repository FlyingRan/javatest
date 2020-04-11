package xhr.¼Ì³Ğ;

public class Person {
	private int age;
	private String name;
	private boolean sex;
	public Person(String _name,int _age) {
		age=_age;
		name=_name;
	}
	public void setAge(int _age) {
		if(_age>0 && _age <100)
			age=_age;
		else
			System.out.println("ÊäÈë³ö´í£¬ÇëÖØĞÂÊäÈë");
	}
	public int getAge() {
		return age;
	}
	public void setName(String _name) {
		name=_name;
	}
	public String getName() {
		return name;
	}
	
	public String toString() {
		return "person's name is" +name+"age is "+age;
	}
}
