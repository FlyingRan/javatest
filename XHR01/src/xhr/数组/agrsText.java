package xhr.����;
//args���������������е�
//�Ҽ�run as �ڶ��� �������
public class agrsText {

	public static void main(String[] args) {
		if(args.length!=2) {
			System.out.println("��������ȷ���û���������");
			return;
		}
		String name = args[0];
		String password = args[1];
		if("���Ȼ" .equals(name)&&"1045425708".equals(password)) {
			System.out.println("��½�ɹ�����ӭ������");
		}else {
			System.out.println("��½ʧ�ܣ������û��������룡");
		}
	}

}
