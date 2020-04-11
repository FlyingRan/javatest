package xhr.常用类;

public class BoxText01 {

	public static void main(String[] args) {
		//自动装箱，就是将基本的数据类型转换为对应的的包装类
		Integer a=10;//相当于new Integer（10）
		//自动拆箱(拆类)
		Integer b = new Integer(20);
		int c = b;
		
		Integer q=127;
		Integer w=127;
		System.out.println(q==w);
		//整型常量池，如果整型数在-128-127之间，直接调用常量池，不用开辟新的空间
		
	}

}
