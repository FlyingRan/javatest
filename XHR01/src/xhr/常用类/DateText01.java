package xhr.≥£”√¿‡;

public class DateText01 {
	public static void main (String[] args) {
		long before = System.currentTimeMillis();
		System.out.println(before);
		StringBuffer b = new StringBuffer(100);
		for(int i=0;i<10000;i++) {
			b.append(i);
		}
		long after= System.currentTimeMillis();
		System.out.println(after-before);
	}
}
