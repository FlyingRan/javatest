package xhr.������;

import java.math.BigDecimal;

public class BigDecimalText {

	public static void main(String[] args) {
		//�����ж��о���Ҫ���һ����������
		BigDecimal a = new BigDecimal("2.0");
		BigDecimal b = new BigDecimal("1.1");
		System.out.println(a.subtract(b));
		
		//����һ��Ҳ����
		BigDecimal c = BigDecimal.valueOf(2.0);
		BigDecimal d = BigDecimal.valueOf(1.1);
		System.out.println(c.subtract(d));
	}

}
