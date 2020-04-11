package xhr.集合;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsText {//这是一个工具类！跟之前的接口无关系，Arrays也是一个工具类

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(1);
		a.add(-1);
		a.add(3);
		a.add(-3);
		System.out.println(Collections.max(a));
		Collections.sort(a);
		System.out.println(a);
		System.out.println(Collections.binarySearch(a, 2));
		List<ArrayList<Integer>> l =Collections.singletonList(a);
		System.out.println(l);
		Collections.shuffle(a);//打乱顺序；
		System.out.println(a);
		Collections.reverse(a);
		System.out.println(a);
	}

}
