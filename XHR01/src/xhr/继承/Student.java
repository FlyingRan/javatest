package xhr.继承;

public class Student {
	int id;
	int age;
	String name;
	boolean sex;
	public Student() {
		System.out.println("这是构造方法！");
	}
	public void study(){
	System.out.println("我一定要好好学习，天天向上，不能向她学习");
	}
	public void friend(String friend){
	System.out.println( friend + "是" +"蠢猪");
	}
	public void sport(String sport){
	System.out.println("钱方怡喜欢" +sport);
	}

}
