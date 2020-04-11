package xhr.¼¯ºÏ;

import java.util.TreeSet;

public class TreeSetText03 {

	public static void main(String[] args) {
		TreeSet<CPerson> t = new TreeSet<>(new Compare());
		t.add(new CPerson(19,"xhr"));
		t.add(new CPerson(18,"xd"));
		t.add(new CPerson(9,"ahza"));
		t.add(new CPerson(8,"ahza"));
		System.out.println(t);
	}

}
