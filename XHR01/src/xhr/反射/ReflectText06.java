package xhr.反射;

public class ReflectText06 {
	//使用反射获取父类和父接口
	public static void main(String [] args) throws ClassNotFoundException {
		Class c = Class.forName("java.lang.StringBuffer");
		Class sup = c.getSuperclass();
		System.out.println(sup.getName());
		Class[] inter = c .getInterfaces();
		for(Class in : inter) {
			System.out.println(in.getName());
		}
	}
}
