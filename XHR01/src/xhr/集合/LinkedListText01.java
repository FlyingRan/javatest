package xhr.集合;

import java.util.LinkedList;

public class LinkedListText01 {

	public static void main(String[] args) {
		LinkedList a = new LinkedList();
		a.addFirst(new CPerson(21,"xhr"));
		a.addFirst(new CPerson(21,"xhD"));
		a.addFirst(new CPerson(21,"xhB"));
		a.addLast(new CPerson(23,"sb"));
		System.out.println(a);
		a.removeFirst();
		a.removeLast();
		System.out.println(a);
		//还有getfirst getlast 的方法
	}

}
