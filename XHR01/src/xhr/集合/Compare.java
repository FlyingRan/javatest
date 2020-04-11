package xhr.集合;

import java.util.Comparator;

public class Compare implements Comparator<CPerson> {

	@Override//自定义TreeSet 的比较器！
	public int compare(CPerson o1, CPerson o2) {
		int num = o1.getName().length()-o2.getName().length();
		if(num==0) {
			num = o1.getAge()-o2.getAge();
		}
		return num;
	}
	
}
