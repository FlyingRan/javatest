package xhr.������;

import java.util.Arrays;
import java.util.Random;

public class RandomText01 {

	public static void main(String[] args) {
		//Random a = new Random();
		//System.out.println(a.nextInt(101));//����0-100֮�������
		//˫ɫ��
		int[] ball = new int[33];
		for(int i=0; i<33; i++) {
			ball[i]=i+1;
		}
		int[] result = new int[6];
		int index=0;//��ʼ�������±�
		Random h = new Random();
		boolean[] c = new boolean[33];
		while(true) {
			int red = h.nextInt(33);
			result[index++]=ball[red];
			if(c[red]==true) continue;
			if(index==6) break;
			c[red]=true;//ȥ�أ������ɵĺ����±�Ϊtrue
		}
		Arrays.parallelSort(result);
		int blue = h.nextInt(16);
		for(int i = 0; i<result.length;i++)
			if(i==result.length-1) 
				System.out.println(result[i]);
			else {
				System.out.println(result[i]+",");
			}
		System.out.println("����ʱ"+blue);
	}

}
