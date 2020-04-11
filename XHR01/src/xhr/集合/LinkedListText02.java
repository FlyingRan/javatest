package xhr.集合;

import java.util.LinkedList;

//用LinkedList实现栈的数据结构
public class LinkedListText02 {
	LinkedList a = new LinkedList();
	public  void push(Object obj) {
		a.addLast(obj);
	}
	public Object pop() {
		
		return a.removeLast();
	}
	public boolean isempty() {
		
		return a.isEmpty();
		
	}
	public static void main(String[] args) {
		LinkedListText02 c = new LinkedListText02();
		c.push(new CPerson(21,"xhr"));
		c.push(new CPerson(21,"xhr"));
		c.push(new CPerson(21,"xhr"));
		while(!c.isempty())
			System.out.println(c.pop());
		
	}

}
