package xhr.�߳�;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Timer;
import java.util.TimerTask;

public class TimerText {
	public static void main(String [] args) throws ParseException {
		Timer t = new Timer();
		t.schedule(new MytimerTask(), new SimpleDateFormat("yyyy-MM-dd hh:mm:ss SSS").parse("2019-08-09 22:28:30 200"), 5000);
	}
}
//�̳�TimerTask ��Ҫִ�еĴ���д��run���� ��ʱִ��
class MytimerTask extends TimerTask{

	@Override
	public void run() {
		System.out.println("���ȻҪ����Ѷ ");
	}
	
}