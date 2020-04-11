package xhr.常用类;

import java.math.BigInteger;

public class BigIntegerText {
//当数字较大时可以使用BigIneteger类来创建数字
	public static void main(String[] args) {
		BigInteger a = new BigInteger("1000000000000");
		BigInteger b = new BigInteger("1");
		System.out.println(a.add(b));
		System.out.println(a.subtract(b));
		System.out.println(a.divide(b));
		System.out.println(a.multiply(b));
		
		BigInteger[] s = a.divideAndRemainder(b);//商和余数，以数组呈现
		for(int i=0;i<s.length;i++)
			System.out.println(s[i]);
	}

}
