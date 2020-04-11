package xhr.数组;

import java.util.Arrays;

public class arraysText {

/* JDK
 * Arrays 常用工具类：
 * 1.equals([],[]) 判断两数组是否相同
 * 2.sort([]) 排序
 * 3.binarysearch(int [],int) 二分法查找目标值
 * 4.tostring()
 * */
	public static void main(String[] args) {
		int[] a = {1,3,5,7,9,2,4,6,8,10};
		int[] b = {1,3,5,7,9,2,4,6,8,10};
		System.out.println(Arrays.equals(a, b));
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		
		
		
		
		System.out.println(Arrays.binarySearch(a, 8));
		System.out.println(Arrays.toString(a));
	}

}
