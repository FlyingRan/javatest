package xhr.����;

import java.util.Scanner;

public class jiudian_text {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("��ӭʹ�����Ȼ�����ľƵ����ϵͳ��");
		jiudian_hotel b = new jiudian_hotel();
		b.print();
		while(true) {
		System.out.println("��������Ĳ��� �� 1.Ԥ������  2.�˷� 3.�˳�ϵͳ");
		int action = a.nextInt();
		if(action==1) {
			System.out.println("������������ҪԤ���ķ���ţ�");
			String s= a.next();
			b.order(s);
		}
		else if(action==2) {
			System.out.println("������������Ҫ�˶��ķ���ţ�");
			String s= a.next();
			b.out(s);
		}
		else {
			System.out.println("�˳�ϵͳ�ɹ�����ӭ�´�������");
			break;
		}
		}
		a.close();
	}
}
