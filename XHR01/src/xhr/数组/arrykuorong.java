package xhr.����;

import java.util.Scanner;

public class arrykuorong {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int[] b = new int[3];
		int[] c = new int[5];
		for(int i=0;i<b.length;i++) {
			b[i]=a.nextInt();
		}
		for(int i=0;i<c.length;i++) {
			c[i]=a.nextInt();
		}
		//System.arraycopy(src(ԭ����), srcPos��������ʼ�㣩, dest��Ŀ�����飩, destPos��Ŀ��������ʼ�㣩, length�����Ƶĳ��ȣ�);
		System.arraycopy(b, 0, c, 2, 1);
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
	}

}
