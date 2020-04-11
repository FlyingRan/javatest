package xhr.反射;

import java.lang.reflect.Field;

public class ReflectText05 {
//使用反射获取类中的指定属性，并且为其复制
	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, InstantiationException, IllegalAccessException {
		Class c = Class.forName("xhr.反射.User");
		/*
		 * Field f =c.getDeclaredField("name");//获取指定的field对象；
		 *  Object o =c.newInstance(); f.set(o, "张三");//给o对象上的name属性 
		 * System.out.println(f.get(o));
		 */
		Field f =c.getDeclaredField("age");//私有的会抛出异常
		Object o =c.newInstance(); 
		f.setAccessible(true);//从外部打破封装性
		f.set(o, 19);
		System.out.println(f.get(o));
	
	}
 
}
