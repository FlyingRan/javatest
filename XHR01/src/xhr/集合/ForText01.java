package xhr.集合;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ForText01 {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("a");
		l.add("d");
		l.add("c");
		l.add("g");
		//增强for循环
		for(String S : l) {
			System.out.println(S);
		}
		//删除有两种方法，一种是迭代器，比较常用。第二钟是for索引，不过要注意自减
		ListIterator it = l.listIterator();
		for(;it.hasNext();) {
			if("d".equals(it.next())) {
				it.remove();
			}
		}
		for(String S : l) {
			System.out.println(S);
		}
		
		//第二种
		for(int i =0;i<l.size();i++) {
			if("g".equals(l.get(i))) {
				l.remove(i);
				i--;
			}
			
		}
		for(String S : l) {
			System.out.println(S);
		}
	}

}
