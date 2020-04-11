package xhr.线程;

//1.创建一个类继承Thread
class Mythread extends Thread{
	//2.重写run方法
	public void run() {
		//3.将要在线程中执行的代码，写到run中
		for(int i = 0;i<100 ;i++)
			System.out.println(i);
	}
}

public class ThreadText01 {

	public static void main(String[] args) {
		//4.创建对象
		Mythread  mt = new Mythread();
		//5.执行start方法启动线程
		mt.start();
		for(int i = 0;i<100;i++)
			System.out.println(i);
	}	

}
