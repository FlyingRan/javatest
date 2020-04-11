package xhr.¼¯ºÏ;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListText03 {

	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(new CPerson(19,"xhr"));
		l.add(new CPerson(19,"xhd"));
		l.add(new CPerson(19,"xhb"));
		l.add(new CPerson(19,"xhb"));
		
		List nl = new LinkedList();
		Iterator it = l.iterator();
		while(it.hasNext()) {
			CPerson o= (CPerson)it.next();
			if(!nl.contains(o)) {
				nl.add(o);
			}
		}
		System.out.println(nl);
	}

}
