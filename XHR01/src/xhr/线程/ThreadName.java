package xhr.�߳�;

public class ThreadName {

	public static void main(String[] args) {
		//����1
		new Thread("xhr") {
			public void run() {
				System.out.println(this.getName()+"��ȥ��Ѷ������Գ");
			}
		}.start();
		
		new Thread("xhd") {
			public void run() {
				System.out.println(this.getName()+"��ȥ���ﵱ����Գ");
			}
		}.start();
		
		
		//������
		new Thread() {
			public void run() {
				this.setName("xhr");
				System.out.println(this.getName()+"��ȥ��Ѷ����");
			}
		}.start();
		
		new Thread() {
			public void run() {
				this.setName("xhd");
				System.out.println(this.getName()+"��ȥ���﹤��");
			}
		}.start();
		
		//������
		Thread t1= new Thread() {
			public void run() {
			 	System.out.println(this.getName()+"��ȥ��Ѷ");
			}
		};
		Thread t2= new Thread() {
			public void run() {
				System.out.println(this.getName()+"��ȥ����");
			}
		};
		t1.setName("xhr");
		t2.setName("xhd");
		t1.start();
		t2.start();
	}

}
