package xhr.������;

public class StringBufferText01 {

	public static void main(String[] args) {
		StringBuffer a = new StringBuffer();//û����ȷָ����Ĭ��16
		System.out.println(a.capacity());
		StringBuffer b = new StringBuffer(100);//Ԥ���ַ����ĳ���
		System.out.println(b.capacity());
		StringBuffer c = new StringBuffer("xhr");//����String���ͣ�Ĭ�ϳ���Ϊlength+16��
		System.out.println(c.capacity());

	}

}
