package xhr.常用类;

public class StingBufferText02 {

	public static void main(String[] args) {
		StringBuffer a =new StringBuffer(30);
		//字符串拼接
		a.append("woshixuahoran ");
		a.append("xhr");
		System.out.println(a);
		a.insert(3, "zhu");//在指定位置插入
		System.out.println(a);
		a.delete(3, 6);//将指定区间删除
		System.out.println(a);
	}

}
