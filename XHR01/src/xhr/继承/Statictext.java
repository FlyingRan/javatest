package xhr.继承;
//静态语句只会执行一次，自上而下执行，而且是在构造方法之前执行！
public class Statictext {
	static {
		System.out.println("这是静态语句");
	}
	static {
		System.out.println("这也是静态语句块");
	}
	static int i=1;
	static {
		System.out.println(i);
	}
	
	public Statictext() {
		System.out.println("这是构造方法");
	}
	public static void main(String[] args) {
		
		new Statictext();
		new Statictext();
		System.out.println("这是main方法");
	}

}
