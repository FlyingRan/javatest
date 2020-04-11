package xhr.集合;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetText01 {

	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<>();//TreeSet的特点就是自动去重，且排序
		t.add(1);
		t.add(2);
		t.add(2);
		t.add(-1);
		Iterator<Integer> it = t.iterator();
		for(;it.hasNext();) {
			System.out.println(it.next());
		}
		TreeSet<String> T = new TreeSet<>();//TreeSet的特点就是自动去重，且排序
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
