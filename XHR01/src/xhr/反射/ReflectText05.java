package xhr.����;

import java.lang.reflect.Field;

public class ReflectText05 {
//ʹ�÷����ȡ���е�ָ�����ԣ�����Ϊ�临��
	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, InstantiationException, IllegalAccessException {
		Class c = Class.forName("xhr.����.User");
		/*
		 * Field f =c.getDeclaredField("name");//��ȡָ����field����
		 *  Object o =c.newInstance(); f.set(o, "����");//��o�����ϵ�name���� 
		 * System.out.println(f.get(o));
		 */
		Field f =c.getDeclaredField("age");//˽�еĻ��׳��쳣
		Object o =c.newInstance(); 
		f.setAccessible(true);//���ⲿ���Ʒ�װ��
		f.set(o, 19);
		System.out.println(f.get(o));
	
	}
 
}
