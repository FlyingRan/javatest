package xhr.线程;

public class ThreadName {

	public static void main(String[] args) {
		//方法1
		new Thread("xhr") {
			public void run() {
				System.out.println(this.getName()+"想去腾讯当程序猿");
			}
		}.start();
		
		new Thread("xhd") {
			public void run() {
				System.out.println(this.getName()+"想去阿里当程序猿");
			}
		}.start();
		
		
		//方法二
		new Thread() {
			public void run() {
				this.setName("xhr");
				System.out.println(this.getName()+"想去腾讯工作");
			}
		}.start();
		
		new Thread() {
			public void run() {
				this.setName("xhd");
				System.out.println(this.getName()+"想去阿里工作");
			}
		}.start();
		
		//方法三
		Thread t1= new Thread() {
			public void run() {
			 	System.out.println(this.getName()+"想去腾讯");
			}
		};
		Thread t2= new Thread() {
			public void run() {
				System.out.println(this.getName()+"想去阿里");
			}
		};
		t1.setName("xhr");
		t2.setName("xhd");
		t1.start();
		t2.start();
	}

}
