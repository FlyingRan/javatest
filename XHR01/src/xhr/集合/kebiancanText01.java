package xhr.集合;

public class kebiancanText01 {
//可变参数，当有多个参数时，可变参数必须放最后！，可变参数可以当作数组操作
	public static void print(String s, int ... arr) {
		System.out.print(arr[0]);
		if("b".equals(s))
			for(int i : arr) {
				System.out.println(i);
			}
	}
	public static void main(String[] args) {
		print("b",1,2,3);
	}

}
