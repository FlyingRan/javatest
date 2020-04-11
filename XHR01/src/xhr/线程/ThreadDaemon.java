package xhr.线程;

public class ThreadDaemon {

	public static void main(String[] args) {
		Thread music = new Thread() {
			public void run() {
				while(true) {
					System.out.println("-------音乐播放中-------");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		Thread install = new Thread() {
			public void run() {
				
				for(int i = 0;i<=100;i=i+10) {
					System.out.println("----音乐已下载"+i+"%-----");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("任务完成");
			}
		};
		music.setDaemon(true);
		music.start();
		install.start();	
	}

}
