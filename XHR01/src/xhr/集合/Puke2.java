package xhr.集合;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Puke2 {

	public static void main(String[] args) {
		String[] num = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String[] colar = {"方块","红桃","黑桃","梅花"};
		ArrayList<Integer> l = new ArrayList<>();
		Map<Integer,String> m =new HashMap<>();
		int index=0;
		for(String s1 : num) {
			for(String s2 : colar) {
				m.put(index, s2+s1);
				l.add(index);
				index++;
			}
			
		}
		System.out.println(index);
		m.put(index, "大王");
		l.add(index++);
		m.put(index, "小王");
		l.add(index);
		Collections.shuffle(l);
		TreeSet<Integer> xhr = new TreeSet<>();
		TreeSet<Integer> xhd = new TreeSet<>();
		TreeSet<Integer> xhb = new TreeSet<>();
		TreeSet<Integer> dipai = new TreeSet<>();
		for(int i=0;i<l.size();i++) {
			if(i>=l.size()-3) dipai.add(l.get(i));
			if(i%3==0) xhr.add(l.get(i));
			if(i%3==1) xhd.add(l.get(i));
			if(i%3==2) xhb.add(l.get(i));
		}
		for(Integer i : xhr) {
			System.out.print(m.get(i)+" ");
		}
		System.out.println();
		for(Integer i : xhd) {
			System.out.print(m.get(i)+" ");
		}
		System.out.println();
		for(Integer i : xhb) {
			System.out.print(m.get(i)+" ");
		}
		System.out.println();
		for(Integer i : dipai) {
			System.out.print(m.get(i)+" ");
		}
		System.out.println();
	}

}
