package xhr.继承;

public class Studenttext {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		Student a = new Student();
		a.id=38;
		a.age=20;
		a.sex=true;
		a.name="许浩然";
		System.out.println(a.name);
		System.out.println(a.sex ? '男':'女');
		System.out.println(a.id);
		a.friend("钱方怡");
		a.sport("打游戏");
		a.sport("睡觉");
		a.study();
	}

}
