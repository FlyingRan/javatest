package xhr.�߳�;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
//1.�Զ������ʵ��Callable�ӿ�
class Mycallable implements Callable{
	
	private int i;

	public Mycallable(int i) {
		this.i = i;
	}
	//2.��дcall����
	public Integer call() throws Exception {
		//3.�߳���ִ�еĴ���
		int sum=1;
		for(int j = 1 ; j<=i;j++)
			sum=sum*j;
		return sum;
	}
	
}
public class TheradText03 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//4.����ExecutorService�̳߳�
		ExecutorService es = Executors.newFixedThreadPool(3);
		//5.���Զ����������̳߳�
		
	
		//6.��ȡ�̷߳��ؽ��
		Future<Integer> f1 = es.submit(new Mycallable(3));
		Future<Integer> f2 = es.submit(new Mycallable(4));
		Future<Integer> f3 = es.submit(new Mycallable(5));
		System.out.println(f1.get());
		System.out.println(f2.get());
		System.out.println(f3.get());
		//7.�ر��̳߳أ����ٽ����µ��̣߳�δִ����Ĳ���ر�
		es.shutdown();
	}

}
