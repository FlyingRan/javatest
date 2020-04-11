package xhr.线程;

public class ThreadSleep {
//可以用interrupt方法唤醒睡眠中的线程
	public static void main(String[] args) {
		for(int i = 10;i>0;i--) {
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("倒计时："+i+"s");
		}
		
		new Thread() {
			public void run() {
				
				for(int i =0 ;i<10;i++) {
					try {
						Thread.currentThread().sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(1024);
				}
			}
		}.start();
		new Thread() {
			public void run() {
				
				for(int i =0 ;i<10;i++) {
					try {
						Thread.currentThread().sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(1045);
				}
					
			}
		}.start();
	}

}
