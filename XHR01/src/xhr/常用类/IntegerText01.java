package xhr.常用类;

public class IntegerText01 {
/*	int或者String转Integer
 * integer.valueof(a);a可以是int或者String 
 * int a = b.intvalue (b是integer类型 转为int型)
 * integer转为String 用toString()方法
 * String a= 10+""  int变为字符串型
 * */
	public static void main(String[] args) {
		Integer a = new Integer(10);
		System.out.println(a);
		Integer b = new Integer("1024");//异常：可以把字符串转成int型，但是其中必须全是数字，否则抛出NumberFormatException 异常！
		System.out.println(b);
		//将a的值赋给int型的i；（integer转为int）
		int i =a.intValue();
		System.out.println(i);
		int c = Integer.parseInt("1026");//将一个String 类型的转化为int类型的（括号内为字符串类型）
		//int型 转为 Integer型
		Integer d = Integer.valueOf(i);
		System.out.println(i);
		String e = Integer.toBinaryString(12);//将一个int型转换为一个二进制（字符串）
		String f = Integer.toOctalString(12);//八进制，同上
		String g = Integer.toHexString(12);//十六进制
		System.out.println(e);
	}
}
