package xhr.����;

public class kebiancanText01 {
//�ɱ���������ж������ʱ���ɱ�����������󣡣��ɱ�������Ե����������
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
