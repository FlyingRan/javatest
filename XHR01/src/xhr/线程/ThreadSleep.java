package xhr.�߳�;

public class ThreadSleep {
//������interrupt��������˯���е��߳�
	public static void main(String[] args) {
		for(int i = 10;i>0;i--) {
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("����ʱ��"+i+"s");
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
