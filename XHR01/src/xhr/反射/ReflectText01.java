package xhr.����;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflectText01 {
//ʹ�÷����ȡ���е�����
	public static void main(String[] args) throws ClassNotFoundException {
		Class c = Class.forName("xhr.����.User");
		//Field[] f = c.getFields();//��ȡpublic���ε���������
		Field[] f = c.getDeclaredFields();//��ȡ�������Եı�����
		for(Field F : f) {
			System.out.println(F.getName());//��ȡ���Ա�����
			System.out.println(F.getModifiers());//��ȡ��������Ȩ�޵�intֵ
			Modifier.toString(F.getModifiers());//���������ε�intֵתΪString����
			Class C = F.getType();//��ȡ�������͵�class����
			System.out.println(C.getName());
			System.out.println(C.getSimpleName());	
		}
		//ʹ�÷��䷴����User��
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
