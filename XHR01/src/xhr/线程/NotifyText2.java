package xhr.线程;

public class NotifyText2 {
//两个线程之间的通信，让两个线程交替在控制太交替输出一行文字
	public static void main(String[] args) {
		Print1 p = new Print1();
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
		Thread t3 = new Thread() {
			public void run() {
				while(true) {
					p.print3();
				}
			}
		};
		t1.start();
		t2.start();
		t3.start();
	}
	

}
class Print1{
	private int flag = 1;
	public void  print1() {
		synchronized(this) {
			while(flag !=1) {
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		
			System.out.println("许浩然进腾讯");
			this.notifyAll();
			flag=2;
		
		}
	}
	public void  print2() {
		synchronized(this) {
			while(flag !=2) {
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		
			System.out.println("许浩然进阿里");
			this.notifyAll();
			flag=3;
		}
		
	}
	public void  print3() {
		synchronized(this) {
			while(flag !=3) {
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		
			System.out.println("许浩然进百度");
			this.notifyAll();
			flag=1;
		}
		
	}
}