package xhr.¼¯ºÏ;

public class CPerson implements Comparable<CPerson>{
	private int age;
	private String name;

	public int getAge() {
		return age;
	}
	public CPerson() {
		
	}
	public  CPerson(int age,String name) {
		this.age=age;
		this.name=name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "CPerson [age=" + age + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CPerson other = (CPerson) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	public int compareTo(CPerson o) {
		int num = this.age-o.getAge();
		if (num == 0) {
			num = this.getName().compareTo(o.getName());
		}
		return num;
	}
	
}
