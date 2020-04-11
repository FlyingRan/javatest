package xhr.常用类;

public class StringText02 {
/*String类
 * contains（s）；查看是否包含s，返回true或false
 * endwith（s）；查看是否是以s结尾 boolean
 * equalsIgnoreceCase（s）；忽略字符串大小写，比较字符串；
 * getbytes（）；将字符串转为byte类型  byte[] a = s.getbytes();
 * s.replaceall(s1,s2) 方法  将s 中 的s1全部转换为s2
 * split(s) 将一个字符串以s的拆分 a,b,d,d-> a b c d
 * startwith() 查看是否是以某个字符串开头  Boolean
 * touppercase（） 转为大写  tolowercase 转为小写 
*/
	public static void main(String[] args) {
		String s = "qwerty";
		char[] a = s.toCharArray();//将字符串改编成字符数组；
		String s1 = new String(a);//将字符数组转为 字符串
		String s2 = new String(a,2,2);//将部分字符数组转为字符串
		System.out.println(s2);
		System.out.println(s.charAt(2));//返回字符串某个位置的字符
		System.out.println(s.indexOf(s2));//返回字符串中子串的位置
		System.out.println(s.indexOf(s2,2));//从字符串的指定位置查找字串，返回位置，没有返回-1；
		//还有lastindexof 是从后面开始找
		System.out.println(s.trim());//去空格之后输出，首尾的空格
		System.out.println(s.substring(2));//截取字符串
		System.out.println(s);
		System.out.println(s.substring(2,4));
		
	}
}
