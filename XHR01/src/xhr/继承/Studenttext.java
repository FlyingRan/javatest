package xhr.�̳�;

public class Studenttext {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		Student a = new Student();
		a.id=38;
		a.age=20;
		a.sex=true;
		a.name="���Ȼ";
		System.out.println(a.name);
		System.out.println(a.sex ? '��':'Ů');
		System.out.println(a.id);
		a.friend("Ǯ����");
		a.sport("����Ϸ");
		a.sport("˯��");
		a.study();
	}

}
