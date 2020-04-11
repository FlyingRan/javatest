package xhr.¼¯ºÏ;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionText01 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		Collection a = new ArrayList();
		a.add("xhr");
		a.add("xhd");
		a.add("xhb");
		Collection b = new ArrayList();
		b.add("xhr");
		b.add("xhd");
		b.add("xhb");
		System.out.println(a);
		System.out.println(a.contains("xhr"));
		a.remove("xhr");
		System.out.println(a);
		a.clear();
		System.out.println(a.isEmpty());
	}
}
