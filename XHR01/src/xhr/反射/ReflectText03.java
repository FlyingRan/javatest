package xhr.反射;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectText03 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class c = Class.forName("xhr.反射.User");
		
		/*
		 * Method m = c.getDeclaredMethod("m1");//获取方法 
		 * Object o = c.newInstance();//创建对象
		 * m.invoke(o);
		 */
		/*
		 * Method m = c.getDeclaredMethod("m2");//获取方法 
		 * Object o = c.newInstance();//创建对象
		 * m.invoke(o);
		 */
		/*
		 * Method m = c.getDeclaredMethod("m3");//获取方法 
		 * Object o = c.newInstance();//创建对象
		 * m.setAccessible(true); 
		 * System.out.println(m.invoke(o));
		 */
		Method m = c.getDeclaredMethod("m4",int.class,String.class);//获取方法
		Object o  = c.newInstance();//创建对象
		m.invoke(o,2,"xhr");
	}
}
