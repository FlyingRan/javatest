package xhr.������;

public class IntegerText01 {
/*	int����StringתInteger
 * integer.valueof(a);a������int����String 
 * int a = b.intvalue (b��integer���� תΪint��)
 * integerתΪString ��toString()����
 * String a= 10+""  int��Ϊ�ַ�����
 * */
	public static void main(String[] args) {
		Integer a = new Integer(10);
		System.out.println(a);
		Integer b = new Integer("1024");//�쳣�����԰��ַ���ת��int�ͣ��������б���ȫ�����֣������׳�NumberFormatException �쳣��
		System.out.println(b);
		//��a��ֵ����int�͵�i����integerתΪint��
		int i =a.intValue();
		System.out.println(i);
		int c = Integer.parseInt("1026");//��һ��String ���͵�ת��Ϊint���͵ģ�������Ϊ�ַ������ͣ�
		//int�� תΪ Integer��
		Integer d = Integer.valueOf(i);
		System.out.println(i);
		String e = Integer.toBinaryString(12);//��һ��int��ת��Ϊһ�������ƣ��ַ�����
		String f = Integer.toOctalString(12);//�˽��ƣ�ͬ��
		String g = Integer.toHexString(12);//ʮ������
		System.out.println(e);
	}
}
