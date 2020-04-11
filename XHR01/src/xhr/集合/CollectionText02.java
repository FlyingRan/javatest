package xhr.集合;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionText02 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		Collection a = new ArrayList();//多态
		CPerson p = new CPerson(19,"xhr");
		Collection b =new ArrayList();
		b.add(new CPerson(19,"sfd"));
		System.out.println(b);
		a.add(new CPerson(19,"xhr"));
		a.add(new CPerson(24,"xhd"));
		a.add(new CPerson(26,"xhb"));
		System.out.println(a);
		Object[] c = a.toArray();
		for(int i = 0;i<c.length;i++)
			System.out.println(c[i]);
		System.out.println(a.contains(p));
		a.remove(new CPerson(19,"xhr"));
		System.out.println(a);
		a.addAll(b);
		System.out.println(a);
		a.clear();//此时集合a为空
		System.out.println(a.isEmpty());
	}
}
