package xhr.������;

public class StingBufferText02 {

	public static void main(String[] args) {
		StringBuffer a =new StringBuffer(30);
		//�ַ���ƴ��
		a.append("woshixuahoran ");
		a.append("xhr");
		System.out.println(a);
		a.insert(3, "zhu");//��ָ��λ�ò���
		System.out.println(a);
		a.delete(3, 6);//��ָ������ɾ��
		System.out.println(a);
	}

}
