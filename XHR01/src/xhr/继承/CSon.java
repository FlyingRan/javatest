package xhr.继承;

public class CSon extends CFather{
	public void m1() {
		System.out.println("这是子类中的m1");
	}
	public void m2() {
			System.out.println("这是通过子类重写修改后父类中的m2");
			super.m2();//引用没有修改前的父类的m2方法
	}
	
}
