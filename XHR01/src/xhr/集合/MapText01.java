package xhr.����;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapText01 {

	public static void main(String[] args) {
		Map<Integer,String> m = new HashMap<>();
		m.put(100, "xhr");
		m.put(101, "xhd");
		m.put(102, "xhf");
		m.put(100, "xhh");
		String  s=m.put(100, "xhh");
		System.out.println(m.size());
		System.out.println(m.containsKey(100));
		System.out.println(s);
		System.out.println(m.get(101));
		
		Collection<String> c = m.values();
		System.out.println(c);
		System.out.println();
		//���������ַ���
		System.out.println("��һ�ַ�����");
		Set<Integer> S=m.keySet();//ͨ������������
		Iterator<Integer> it = S.iterator();
		while(it.hasNext()) {
			Integer key = it.next();
			System.out.println("����"+key+",value:"+m.get(key));
		}
		System.out.println("�ڶ��ַ�����");
		Set<Map.Entry<Integer, String>> entryset = m.entrySet();
		for(Map.Entry<Integer, String>  entry : entryset) {
			System.out.println("����"+entry.getKey()+",value:"+entry.getValue());
		}
	}

}
