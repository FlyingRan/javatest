package xhr.线程;
//1.自定义一个类实现Runnable
class Myrunnable implements Runnable{
	//2.重写run方法
	@Override
	public void run() {
		//3.输入代码
		int i = 0;
		for(;i<1000;i++)
			System.out.println(i);
	}
	
}
public class ThreadText02 {

	public static void main(String[] args) {
		//4.创建自定义的对象
			Myrunnable mn = new Myrunnable();
			//5.创建Thread对象，传入自定义对象
			Thread t = new Thread(mn);
			//6.执行start方法
			t.start();
			for(int j =100;j<1000;j++)
				System.out.println(j);
	}

}
