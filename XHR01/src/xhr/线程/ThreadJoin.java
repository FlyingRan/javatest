package xhr.�߳�;

public class ThreadJoin {
//�̵߳ļ���
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
							t1.join();//t1�̼߳��룬ֱ���߳�t1�����Ž���t2�߳�
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
