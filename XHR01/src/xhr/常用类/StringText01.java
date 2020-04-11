package xhr.常用类;
/*正则表达式
 *\d表示数字字符
 *\D表示非数字
 *\w表示字母
 *\W表示非字母
 *可以用repalceall（s1，s2） 将转换，但得加转义字符\
 *像邮箱，手机号等等，都有固定的正则表达式，可上网搜索，接着用s.matches("正则表达式")判断是否为正确的邮箱或者手机格式
 * */
public class StringText01 {

	public static void main(String[] args) {
		String s1= new String("我是许浩然");
		String s2= new String("我是许浩然");
		//这种使用new 无论如何都开辟了一个空间，‘==’比较的是地址，直接实例化的对象在同一个对象池，所以比较时会相同
		System.out.println("s1 s2 是"+(s1==s2));//调用String类中的构造方法实例化对象，直接实例化的方法就是直接等于一个字符串
		//String类中的equals方法已经重写，直接比较内容，所以只要内容相等，不管地址！
		String s3 = "猪"+s1;//可以通过这种方式改变字符串的内容！是内容，但不改变地址；
		System.out.println(s1.substring(1,2));
		int a=1;
		System.out.println(String.valueOf(a));//将其他类型转为String类型
	}

}
