package xhr.����;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectText03 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class c = Class.forName("xhr.����.User");
		
		/*
		 * Method m = c.getDeclaredMethod("m1");//��ȡ���� 
		 * Object o = c.newInstance();//��������
		 * m.invoke(o);
		 */
		/*
		 * Method m = c.getDeclaredMethod("m2");//��ȡ���� 
		 * Object o = c.newInstance();//��������
		 * m.invoke(o);
		 */
		/*
		 * Method m = c.getDeclaredMethod("m3");//��ȡ���� 
		 * Object o = c.newInstance();//��������
		 * m.setAccessible(true); 
		 * System.out.println(m.invoke(o));
		 */
		Method m = c.getDeclaredMethod("m4",int.class,String.class);//��ȡ����
		Object o  = c.newInstance();//��������
		m.invoke(o,2,"xhr");
	}
}
