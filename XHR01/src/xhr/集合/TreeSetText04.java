package xhr.¼¯ºÏ;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetText04 {
//½«×Ö·û´®ÄæÐò
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] c = s.toCharArray();
		TreeSet<Character> t = new TreeSet<>(new Compare2());
		for(int i =0;i<c.length;i++)//for(Character l : c)
			t.add(c[i]);
		for(Character l : t) {
			System.out.print(l);
		}
		System.out.println(t);
	}

}
