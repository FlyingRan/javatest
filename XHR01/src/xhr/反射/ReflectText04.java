package xhr.����;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class ReflectText04 {
//ʹ�÷����ȡ���еĹ��췽��
	public static void main(String[] args) throws ClassNotFoundException {
		Class c = Class.forName("java.lang.StringBuffer");
		Constructor[] con = c.getDeclaredConstructors();//��ȡ�������й��췽��
		for(Constructor co : con) {
			System.out.println(Modifier.toString(co.getModifiers()));//��ȡ���η�
			co.getName();//��ȡ������
			Class[] C = co.getParameterTypes();//��ȡ��������
			for(Class c1 : C) {
				System.out.println(c1.getSimpleName());
			}
		}
	}

}
