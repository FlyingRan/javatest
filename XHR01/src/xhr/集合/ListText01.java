package xhr.集合;

import java.util.ArrayList;
import java.util.List;

public class ListText01 {

	public static void main(String[] args) {
		List l = new ArrayList();
		CPerson h = new  CPerson(19,"xhr");
		l.add(new CPerson(19,"xhr"));
		l.add(new CPerson(19,"xhd"));
		l.add(new CPerson(19,"xhb"));
		l.add(1,new CPerson(19,"xhl"));
		System.out.println(l);
		System.out.println();
		l.set(1, new CPerson(19,"xhf"));//修改指定位置的元素值
		System.out.println(l);
		System.out.println();
		System.out.println(l.get(0));//输出指定位置的元素，可以通过这个遍历，这是list接口特有的
		
	}

}
