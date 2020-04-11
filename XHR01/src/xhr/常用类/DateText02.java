package xhr.常用类;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateText02 {

	public static void main(String[] args) {
		Date a = new Date();
		System.out.println(a);//打印时间，实际调用了toString方法x
		
		Date b = new Date(1000L);//括号里为毫秒
		System.out.println(b);
		//可以用Simpledateformat 类，来修改日期显示格式
		SimpleDateFormat c = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss SSS");
		
		System.out.println(c.format(a));

	}

}
