package xhr.�߳�;

public class ThreadYield {

	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				for(int i=0;i<100;i++) {
					System.out.println("�쵼");
				}
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				for(int i=0;i<100;i++) {
					if(i/2==0)
						Thread.yield();//����
					System.out.println("Ա��");
				}
			}
		};
		t1.start();
		t2.start();
		
	}

}
