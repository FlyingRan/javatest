package xhr.继承;
/*
 方法执行顺序：
 静态代码块（只执行一次）->构造代码块->构造方法
*/
public class DaiMaKuaitext {
	static {
		System.out.println("这是text中的静态代码块");
	}
	public static void main(String[] args) {
		System.out.println("这是main方法中的代码");
		new DaiMaKuai();
		System.out.println("______________");
		new DaiMaKuai();
		
	}

}
