package xhr.����;

import java.util.ArrayList;
import java.util.List;

public class ListText01 {

	public static void main(String[] args) {
		List l = new ArrayList();
		CPerson h = new  CPerson(19,"xhr");
		l.add(new CPerson(19,"xhr"));
		l.add(new CPerson(19,"xhd"));
		l.add(new CPerson(19,"xhb"));
		l.add(1,new CPerson(19,"xhl"));
		System.out.println(l);
		System.out.println();
		l.set(1, new CPerson(19,"xhf"));//�޸�ָ��λ�õ�Ԫ��ֵ
		System.out.println(l);
		System.out.println();
		System.out.println(l.get(0));//���ָ��λ�õ�Ԫ�أ�����ͨ���������������list�ӿ����е�
		
	}

}
