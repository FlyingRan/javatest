package xhr.������;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateText02 {

	public static void main(String[] args) {
		Date a = new Date();
		System.out.println(a);//��ӡʱ�䣬ʵ�ʵ�����toString����x
		
		Date b = new Date(1000L);//������Ϊ����
		System.out.println(b);
		//������Simpledateformat �࣬���޸�������ʾ��ʽ
		SimpleDateFormat c = new SimpleDateFormat("yyyy��MM��dd�� hh:mm:ss SSS");
		
		System.out.println(c.format(a));

	}

}
