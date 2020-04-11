package xhr.多态;

/*final修饰的类不可被继承（没有儿子）
final修饰的方法不可被重写
fianl修饰的局部变量不可被改变；
final 修饰的成员变量 不可更改，且必须初始化（赋值）
final修饰的引用数据类型，地址不变，对象里的值可以改变
总的来说，final 修饰的东西，内存地址不变！*/
public class text01 {

	public final int k=1;
	public static void main(String[] args) {
		
		final int i;
		
		person xhr = new person();
		aodi a= new aodi();
		baoma b = new baoma();
		xhr.drive(a);
		xhr.drive(b);
		/* 多态的优点：减少代码的冗余；开发中使用抽象对象 */
	}

}
