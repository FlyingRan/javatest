package xhr.����;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ForText01 {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("a");
		l.add("d");
		l.add("c");
		l.add("g");
		//��ǿforѭ��
		for(String S : l) {
			System.out.println(S);
		}
		//ɾ�������ַ�����һ���ǵ��������Ƚϳ��á��ڶ�����for����������Ҫע���Լ�
		ListIterator it = l.listIterator();
		for(;it.hasNext();) {
			if("d".equals(it.next())) {
				it.remove();
			}
		}
		for(String S : l) {
			System.out.println(S);
		}
		
		//�ڶ���
		for(int i =0;i<l.size();i++) {
			if("g".equals(l.get(i))) {
				l.remove(i);
				i--;
			}
			
		}
		for(String S : l) {
			System.out.println(S);
		}
	}

}
