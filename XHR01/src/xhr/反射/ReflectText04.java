package xhr.反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class ReflectText04 {
//使用反射获取类中的构造方法
	public static void main(String[] args) throws ClassNotFoundException {
		Class c = Class.forName("java.lang.StringBuffer");
		Constructor[] con = c.getDeclaredConstructors();//获取类中所有构造方法
		for(Constructor co : con) {
			System.out.println(Modifier.toString(co.getModifiers()));//获取修饰符
			co.getName();//获取方法名
			Class[] C = co.getParameterTypes();//获取参数类型
			for(Class c1 : C) {
				System.out.println(c1.getSimpleName());
			}
		}
	}

}
