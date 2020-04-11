package xhr.继承;

public class Persontext {
	public static void m1(Person s) {
		int age=s.getAge();
		s.setAge(++age);
		System.out.println(s.getAge());
		
	}

	public static void main(String[] args) {
		/*
		 * Person a = new Person(); a.setAge(20); a.setName("xhr");
		 * System.out.println(a.getAge()); System.out.println(a.getName()); m1(a);
		 */
		Person a = new Person("xhr",19);
		System.out.println(a.getAge());
		System.out.println(a.getName());
		
		Object o= new Object();
		System.out.println(o.toString());
		Person c = new Person("xhr",20);
		//System.out.println(c.toString());
		System.out.println(c);//当直接输出引用对象时，系统默认使用toString方法
		
	}

}
