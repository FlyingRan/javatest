package xhr.�߳�;

//1.����һ����̳�Thread
class Mythread extends Thread{
	//2.��дrun����
	public void run() {
		//3.��Ҫ���߳���ִ�еĴ��룬д��run��
		for(int i = 0;i<100 ;i++)
			System.out.println(i);
	}
}

public class ThreadText01 {

	public static void main(String[] args) {
		//4.��������
		Mythread  mt = new Mythread();
		//5.ִ��start���������߳�
		mt.start();
		for(int i = 0;i<100;i++)
			System.out.println(i);
	}	

}
