package xhr.接口;
/*
 * 接口中的方法全为抽象方法，即子类必须实现接口中的全部方法。
 * 方法用public abstract 修饰，但在接口中可省略
 * 接口中不允许有其他任何成员存在，包括构造方法和初始化块
 * */
public class Text {

	public static void main(String[] args) {
		person a = new person();
		milk m = new milk();
		bread b = new bread();
		a.chi(m);
		a.chi(b);
	}
}
