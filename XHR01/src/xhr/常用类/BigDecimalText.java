package xhr.常用类;

import java.math.BigDecimal;

public class BigDecimalText {

	public static void main(String[] args) {
		//开发中对有精度要求的一般这样操作
		BigDecimal a = new BigDecimal("2.0");
		BigDecimal b = new BigDecimal("1.1");
		System.out.println(a.subtract(b));
		
		//还有一种也可以
		BigDecimal c = BigDecimal.valueOf(2.0);
		BigDecimal d = BigDecimal.valueOf(1.1);
		System.out.println(c.subtract(d));
	}

}
