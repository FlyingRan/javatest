package xhr.线程;

public class ThreadYield {

	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				for(int i=0;i<100;i++) {
					System.out.println("领导");
				}
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				for(int i=0;i<100;i++) {
					if(i/2==0)
						Thread.yield();//礼让
					System.out.println("员工");
				}
			}
		};
		t1.start();
		t2.start();
		
	}

}
