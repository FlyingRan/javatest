package xhr.����;

import java.util.Comparator;

public class Compare implements Comparator<CPerson> {

	@Override//�Զ���TreeSet �ıȽ�����
	public int compare(CPerson o1, CPerson o2) {
		int num = o1.getName().length()-o2.getName().length();
		if(num==0) {
			num = o1.getAge()-o2.getAge();
		}
		return num;
	}
	
}
