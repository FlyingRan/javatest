package xhr.线程;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
//1.自定义对象实现Callable接口
class Mycallable implements Callable{
	
	private int i;

	public Mycallable(int i) {
		this.i = i;
	}
	//2.重写call方法
	public Integer call() throws Exception {
		//3.线程中执行的代码
		int sum=1;
		for(int j = 1 ; j<=i;j++)
			sum=sum*j;
		return sum;
	}
	
}
public class TheradText03 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//4.创建ExecutorService线程池
		ExecutorService es = Executors.newFixedThreadPool(3);
		//5.将自定义对象放入线程池
		
	
		//6.获取线程返回结果
		Future<Integer> f1 = es.submit(new Mycallable(3));
		Future<Integer> f2 = es.submit(new Mycallable(4));
		Future<Integer> f3 = es.submit(new Mycallable(5));
		System.out.println(f1.get());
		System.out.println(f2.get());
		System.out.println(f3.get());
		//7.关闭线程池，不再接受新的线程，未执行完的不会关闭
		es.shutdown();
	}

}
