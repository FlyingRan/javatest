package xhr.常用类;

public class StringBufferText01 {

	public static void main(String[] args) {
		StringBuffer a = new StringBuffer();//没有明确指出，默认16
		System.out.println(a.capacity());
		StringBuffer b = new StringBuffer(100);//预估字符串的长度
		System.out.println(b.capacity());
		StringBuffer c = new StringBuffer("xhr");//传入String类型，默认长度为length+16；
		System.out.println(c.capacity());

	}

}
