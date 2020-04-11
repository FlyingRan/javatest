package xhr.集合;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetText01 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		Set<CPerson> s = new HashSet();
		s.add(new CPerson(19,"xhr"));
		s.add(new CPerson(19,"xhr"));//需要重写hashCode方法
		s.add(new CPerson(19,"xhd"));
		System.out.println(s.size());
		Iterator it = s.iterator();
		for(CPerson s1 : s) {
			System.out.println(s1);
		}
		for(;it.hasNext();) {
			System.out.println(it.next());
		}
		System.out.println(s.contains(new CPerson(19,"xhr")));
	}

}
