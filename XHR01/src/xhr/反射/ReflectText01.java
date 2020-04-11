package xhr.反射;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflectText01 {
//使用反射获取类中的属性
	public static void main(String[] args) throws ClassNotFoundException {
		Class c = Class.forName("xhr.反射.User");
		//Field[] f = c.getFields();//获取public修饰的属性数组
		Field[] f = c.getDeclaredFields();//获取所有属性的变量名
		for(Field F : f) {
			System.out.println(F.getName());//获取属性变量名
			System.out.println(F.getModifiers());//获取访问修饰权限的int值
			Modifier.toString(F.getModifiers());//将访问修饰的int值转为String类型
			Class C = F.getType();//获取属性类型的class对象
			System.out.println(C.getName());
			System.out.println(C.getSimpleName());	
		}
		//使用反射反编译User类
		StringBuilder sb = new StringBuilder(200); 
		sb.append(Modifier.toString(c.getModifiers())+" class " + c.getSimpleName()+"{"+"\n");
		for(int i=0;i<f.length;i++) {
			sb.append("\t");
			Class C1 = f[i].getType();
			sb.append(Modifier.toString(f[i].getModifiers())+" "+C1.getSimpleName()+" "+ f[i].getName()+";"+"\n");
		}
		sb.append("}");
		System.out.println(sb);
	}

}
