package xhr.数组;

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
		//System.arraycopy(src(原数组), srcPos（复制起始点）, dest（目标数组）, destPos（目标数组起始点）, length（复制的长度）);
		System.arraycopy(b, 0, c, 2, 1);
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
	}

}
