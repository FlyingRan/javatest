package xhr.�߳�;

public class Singleton {
	/*
	 * ������ʽ���롰����ʽ�������������뽨�����������ʱ��Ĳ�ͬ��
	 * 
	 * ������ʽ�������������õ���ʱ���ȥ�������������
	 * 
	 * ���磺�и���������
	 */
	    private Singleton(){}

	    private static Singleton singleton = null;  //����������

	    public static synchronized Singleton getInstance(){

	             if(singleton == null) {        //���ж��Ƿ�Ϊ��                

	                 singleton = new Singleton ();  //����ʽ����

	             }

	             return singleton ;

	     }

	}
	/* ������ʽ�����ڲ������õ��ò��ϣ�һ��ʼ�ͽ�������������󣺱��磺�и��������� */

	/*public class Singleton{

	    public Singleton(){}

	    private static Singleton singleton = new Singleton()��; //��������

	    public static Singleton getInstance(){

	        return singleton ;//ֱ�ӷ��ص�������    }}
*//*
	�������¼���Ҫ�أ�

	�� ˽�еĹ��췽��

	�� ָ���Լ�ʵ����˽�о�̬����

	�� ���Լ�ʵ��Ϊ����ֵ�ľ�̬�Ĺ��еķ���

	 */
//}
