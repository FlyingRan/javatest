package xhr.������;

import java.math.BigInteger;

public class BigIntegerText {
//�����ֽϴ�ʱ����ʹ��BigIneteger������������
	public static void main(String[] args) {
		BigInteger a = new BigInteger("1000000000000");
		BigInteger b = new BigInteger("1");
		System.out.println(a.add(b));
		System.out.println(a.subtract(b));
		System.out.println(a.divide(b));
		System.out.println(a.multiply(b));
		
		BigInteger[] s = a.divideAndRemainder(b);//�̺����������������
		for(int i=0;i<s.length;i++)
			System.out.println(s[i]);
	}

}
