package xhr.�߳�;

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
			System.out.println("whileѭ��");
		}
		System.out.println("����");
	}
	
}
