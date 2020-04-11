package xhr.线程;

public class NotifyText01 {
//两个线程之间的通信，让两个线程交替在控制太交替输出一行文字
	public static void main(String[] args) {
		print p = new print();
		Thread t1 = new Thread() {
			public void run() {
				while(true)
				p.print1();
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				while(true)
				p.print2();
			}
		};
		t1.start();
		t2.start();
	}
	

}
class print{
	private int flag = 1;
	public void  print1() {
		synchronized(this) {
			if(flag !=1) {
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		
			System.out.println("许浩然进腾讯");
			this.notify();
			flag=2;
		
		}
	}
	public void  print2() {
		synchronized(this) {
			if(flag !=2) {
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		
			System.out.println("许浩然进阿里");
			this.notify();
			flag=1;
		}
	}
}