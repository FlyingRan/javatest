package xhr.������;

public class StringText02 {
/*String��
 * contains��s�����鿴�Ƿ����s������true��false
 * endwith��s�����鿴�Ƿ�����s��β boolean
 * equalsIgnoreceCase��s���������ַ�����Сд���Ƚ��ַ�����
 * getbytes���������ַ���תΪbyte����  byte[] a = s.getbytes();
 * s.replaceall(s1,s2) ����  ��s �� ��s1ȫ��ת��Ϊs2
 * split(s) ��һ���ַ�����s�Ĳ�� a,b,d,d-> a b c d
 * startwith() �鿴�Ƿ�����ĳ���ַ�����ͷ  Boolean
 * touppercase���� תΪ��д  tolowercase תΪСд 
*/
	public static void main(String[] args) {
		String s = "qwerty";
		char[] a = s.toCharArray();//���ַ����ı���ַ����飻
		String s1 = new String(a);//���ַ�����תΪ �ַ���
		String s2 = new String(a,2,2);//�������ַ�����תΪ�ַ���
		System.out.println(s2);
		System.out.println(s.charAt(2));//�����ַ���ĳ��λ�õ��ַ�
		System.out.println(s.indexOf(s2));//�����ַ������Ӵ���λ��
		System.out.println(s.indexOf(s2,2));//���ַ�����ָ��λ�ò����ִ�������λ�ã�û�з���-1��
		//����lastindexof �ǴӺ��濪ʼ��
		System.out.println(s.trim());//ȥ�ո�֮���������β�Ŀո�
		System.out.println(s.substring(2));//��ȡ�ַ���
		System.out.println(s);
		System.out.println(s.substring(2,4));
		
	}
}
