package xhr.��̬;

public class text {

	public static void main(String[] args) {
		dog a = new dog();
		a.eat();
		System.out.println(a.num);
		animal b= new dog();//��̬��������������������������
		b.eat();//��̬���뾲̬��
		System.out.println(b.num);//��д���ܶԳ�Ա���������޸�
		//b.move(); error ���Ǵ�ģ��������ø����в����ڵķ�������Ҫǿ��ת������
		
		/* ǿ��ת�� */
		dog c = (dog) b;
		c.move();
		
		animal d= new dog();//������һ��cat��̳�animal�� ��ô���� ��dog תΪ cat
		/*
		  ����ͨ�� instanceof �����ж� d �ɲ�����ת�� 
		  if(d instanceof cat) 
		  	cat f =(cat) d;
		 */
		
		
		
	}

}
