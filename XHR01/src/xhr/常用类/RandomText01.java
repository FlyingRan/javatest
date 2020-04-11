package xhr.常用类;

import java.util.Arrays;
import java.util.Random;

public class RandomText01 {

	public static void main(String[] args) {
		//Random a = new Random();
		//System.out.println(a.nextInt(101));//生成0-100之间的数字
		//双色球
		int[] ball = new int[33];
		for(int i=0; i<33; i++) {
			ball[i]=i+1;
		}
		int[] result = new int[6];
		int index=0;//初始化数组下标
		Random h = new Random();
		boolean[] c = new boolean[33];
		while(true) {
			int red = h.nextInt(33);
			result[index++]=ball[red];
			if(c[red]==true) continue;
			if(index==6) break;
			c[red]=true;//去重，将生成的红球下表赋为true
		}
		Arrays.parallelSort(result);
		int blue = h.nextInt(16);
		for(int i = 0; i<result.length;i++)
			if(i==result.length-1) 
				System.out.println(result[i]);
			else {
				System.out.println(result[i]+",");
			}
		System.out.println("蓝球时"+blue);
	}

}
