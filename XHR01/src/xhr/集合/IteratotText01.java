package xhr.����;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
@SuppressWarnings({ "rawtypes", "unchecked" })
public class IteratotText01 {


	public static void main(String[] args) {
		Collection a = new ArrayList();//��̬
		CPerson c = new CPerson(19,"xhr");
		a.add(new CPerson(19,"xhr"));
		a.add(new CPerson(24,"xhd"));
		a.add(new CPerson(26,"xhb"));
		Iterator it = a.iterator();
		//ɾ��
		for(;it.hasNext();) {
			CPerson p = (CPerson) it.next();
			
			if(c.getAge()==p.getAge() &&c.getName().equals(p.getName()))
				it.remove();
			else
				System.out.println(p);
		}
			
	}

	private static void while1() {
		//����
		Collection a = new ArrayList();//��̬
		a.add(new CPerson(19,"xhr"));
		a.add(new CPerson(24,"xhd"));
		a.add(new CPerson(26,"xhb"));
		Iterator it = a.iterator();
		
		
		
	}

}
