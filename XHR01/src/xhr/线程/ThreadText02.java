package xhr.�߳�;
//1.�Զ���һ����ʵ��Runnable
class Myrunnable implements Runnable{
	//2.��дrun����
	@Override
	public void run() {
		//3.�������
		int i = 0;
		for(;i<1000;i++)
			System.out.println(i);
	}
	
}
public class ThreadText02 {

	public static void main(String[] args) {
		//4.�����Զ���Ķ���
			Myrunnable mn = new Myrunnable();
			//5.����Thread���󣬴����Զ������
			Thread t = new Thread(mn);
			//6.ִ��start����
			t.start();
			for(int j =100;j<1000;j++)
				System.out.println(j);
	}

}
