package xhr.线程;

public class ThreadJoin {
//线程的加入
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				for(int i=0 ;i<100;i++) {
					System.out.println("xhr");
				}
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				for(int i=0 ;i<100;i++) {
					if(i==10) {
						try {
							t1.join();//t1线程加入，直到线程t1结束才进行t2线程
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.println("tx");
				}
			}
		};
		t1.start();
		t2.start();
	}

}
