package xhr.������;
/*������ʽ
 *\d��ʾ�����ַ�
 *\D��ʾ������
 *\w��ʾ��ĸ
 *\W��ʾ����ĸ
 *������repalceall��s1��s2�� ��ת�������ü�ת���ַ�\
 *�����䣬�ֻ��ŵȵȣ����й̶���������ʽ��������������������s.matches("������ʽ")�ж��Ƿ�Ϊ��ȷ����������ֻ���ʽ
 * */
public class StringText01 {

	public static void main(String[] args) {
		String s1= new String("�������Ȼ");
		String s2= new String("�������Ȼ");
		//����ʹ��new ������ζ�������һ���ռ䣬��==���Ƚϵ��ǵ�ַ��ֱ��ʵ�����Ķ�����ͬһ������أ����ԱȽ�ʱ����ͬ
		System.out.println("s1 s2 ��"+(s1==s2));//����String���еĹ��췽��ʵ��������ֱ��ʵ�����ķ�������ֱ�ӵ���һ���ַ���
		//String���е�equals�����Ѿ���д��ֱ�ӱȽ����ݣ�����ֻҪ������ȣ����ܵ�ַ��
		String s3 = "��"+s1;//����ͨ�����ַ�ʽ�ı��ַ��������ݣ������ݣ������ı��ַ��
		System.out.println(s1.substring(1,2));
		int a=1;
		System.out.println(String.valueOf(a));//����������תΪString����
	}

}
