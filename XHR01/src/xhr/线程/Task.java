package xhr.线程;

public class Task implements Runnable{
	private volatile boolean flag=true;

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	@Override
	public void run() {
		while(flag) {
			System.out.println("while循环");
		}
		System.out.println("结束");
	}
	
}
