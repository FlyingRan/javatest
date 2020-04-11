package xhr.Ïß³Ì;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadText04 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//Thread
		new Thread(){
			public void run() {
				System.out.println(3);
			}
		}.start();
		
		//Runable
		new Thread(new Runnable() {
			public void run() {
				System.out.println(4);
			}
		}).start();
		
		//Callable
		ExecutorService es = Executors.newFixedThreadPool(2);
		Future<Integer> f1 = es.submit(new Callable() {
			public Integer call() throws Exception{
				return 20;
			}
		});
		System.out.println(f1.get());
		es.shutdown();
	}

}
