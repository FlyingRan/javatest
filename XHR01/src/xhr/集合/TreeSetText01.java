package xhr.����;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetText01 {

	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<>();//TreeSet���ص�����Զ�ȥ�أ�������
		t.add(1);
		t.add(2);
		t.add(2);
		t.add(-1);
		Iterator<Integer> it = t.iterator();
		for(;it.hasNext();) {
			System.out.println(it.next());
		}
		TreeSet<String> T = new TreeSet<>();//TreeSet���ص�����Զ�ȥ�أ�������
		T.add("b");
		T.add("a");
		T.add("d");
		T.add("b");
		Iterator<String> IT = T.iterator();
		for(;IT.hasNext();) {
			System.out.println(IT.next());
		}
	}

}
