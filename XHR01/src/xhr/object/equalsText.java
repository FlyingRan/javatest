package xhr.object;

/**
 * 
 * @author x0718
 *
 */

class student{
	int age;
	String name;
	public student (String name,int  age) {
		this.age=age;
		this.name=name;
	}
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj instanceof student) {
			student a=(student)obj;
			if(this.age==a.age &&this.name.equals(a.name))//�Ѿ���д
				return true;
		}
		return false;
	}
}
/**
 * 
 * @author x0718
 *
 */
public class equalsText {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[]  args) {
		Object a= new Object();
		Object b = new Object();
		System.out.println(a.equals(b));//���FALSE ϵͳ�е�equals �����ǱȽ��ڴ��ַ�������Ҫ�޸�
		
		student a1 =new student("xhr",19);
		student b1 =new student("xhr",19);
		System.out.println(a1.equals(b1));
	}
}
