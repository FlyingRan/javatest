package xhr.�̳�;
//��̬���ֻ��ִ��һ�Σ����϶���ִ�У��������ڹ��췽��֮ǰִ�У�
public class Statictext {
	static {
		System.out.println("���Ǿ�̬���");
	}
	static {
		System.out.println("��Ҳ�Ǿ�̬����");
	}
	static int i=1;
	static {
		System.out.println(i);
	}
	
	public Statictext() {
		System.out.println("���ǹ��췽��");
	}
	public static void main(String[] args) {
		
		new Statictext();
		new Statictext();
		System.out.println("����main����");
	}

}
