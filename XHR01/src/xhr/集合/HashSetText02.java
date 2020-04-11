package xhr.集合;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;

public class HashSetText02 {
	public static void main(String[] args) {
		//随机生成不重复的1-20 的数字
		HashSet<Integer> h = new HashSet<>();
		Random a = new Random();
		while(h.size()!=10) {
			int s = a.nextInt(20)+1;
			h.add(s);
		}
		for(Integer b : h) {
			System.out.print(b+" ");
		}
		System.out.println();
		//List去重
		List<String> l = new ArrayList<>();
		l.add("s");
		l.add("d");
		l.add("s");
		l.add("d");
		l.add("s");
		l.add("d");
		LinkedHashSet<String> lh= new LinkedHashSet<>();
		lh.addAll(l);
		for(String s1 : lh) {
			System.out.print(s1+" ");
		}
		System.out.println();
		l.clear();
		l.addAll(lh);
		for(String s2 : l) {
			System.out.print(s2+" ");
		}
		
	}
}
