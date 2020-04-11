package xhr.����;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectText02 {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, ClassNotFoundException {
		Class c = Class.forName("xhr.����.User");
		Method[] m =c.getDeclaredMethods();//��ȡ�������е�
		for(Method M : m){
			
			System.out.println(Modifier.toString(M.getModifiers()));;//��ȡ�������η���ͬ���Բ���һ��
			Class type = M.getReturnType();//�����ķ���ֵ����
			System.out.println(type.getSimpleName());
			System.out.println(M.getName());//������
			Class[] par = M.getParameterTypes();//�����Ĳ���
			for(Class C :par) {
				System.out.println(C.getSimpleName());
			}
		}
	}

}
