package xhr.线程;

class Call{
	public synchronized static void call(String name) throws InterruptedException {
		System.out.println(name+"拨打电话");
		Thread.currentThread().sleep(1000);
		System.out.println(name+"正在通话中");
		Thread.currentThread().sleep(1000);
		System.out.println(name+"挂断电话");
	}
}
class phone extends Thread{
	public phone(String string) {
		super(string);
	}

	public void run() {
		try {
			Call.call(getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class synchronizeText01 {

	public static void main(String[] args) {
		phone xhr = new phone("XHR");
		phone xhd = new phone("XHD");
		phone xhb = new phone("XHB");
		xhr.start();
		xhd.start();
		xhb.start();
	}

}
