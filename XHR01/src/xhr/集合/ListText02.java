package xhr.集合;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListText02 {

	public static void main(String[] args) {	
		List l = new ArrayList();
		CPerson h = new  CPerson(19,"xhr");
		l.add(new CPerson(19,"xhr"));
		l.add(new CPerson(19,"xhd"));
		l.add(new CPerson(19,"xhb"));
		ListIterator it = l.listIterator();//最好不用Iterator 如果增加元素个数或减少，会抛出异常 
		while(it.hasNext()) {
			CPerson c = (CPerson)it.next();
			if(c.getAge()==h.getAge() && c.getName().equals(h.getName())) {
				it.add(h);
			}
		}
		System.out.println(l);
		
		while(it.hasPrevious()) {//从后往前
			System.out.println(it.previous());
		}
		System.out.println();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
