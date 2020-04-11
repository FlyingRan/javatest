package xhr.反射;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectText02 {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, ClassNotFoundException {
		Class c = Class.forName("xhr.反射.User");
		Method[] m =c.getDeclaredMethods();//获取方法类中的
		for(Method M : m){
			
			System.out.println(Modifier.toString(M.getModifiers()));;//获取方法修饰符，同属性操作一样
			Class type = M.getReturnType();//方法的返回值类型
			System.out.println(type.getSimpleName());
			System.out.println(M.getName());//方法名
			Class[] par = M.getParameterTypes();//方法的参数
			for(Class C :par) {
				System.out.println(C.getSimpleName());
			}
		}
	}

}
