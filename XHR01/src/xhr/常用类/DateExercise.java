package xhr.������;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateExercise {

	public static void main(String[] args) throws ParseException {
		//����2008��8��8�������ڼ�
		String s = "2008-08-08";
		SimpleDateFormat q = new SimpleDateFormat("yyyy-MM-dd");
		Date a = q.parse(s);
		System.out.println(a);
		Calendar w = Calendar.getInstance();
		w.setTime(a);
		System.out.println("2008��8��8��������"+(w.get(w.DAY_OF_WEEK)-1));
		System.out.println();
		
		//��������������������
		Date y = new Date();
		long now = y.getTime();
		String s1 = "1999-07-18";
		SimpleDateFormat Q = new SimpleDateFormat("yyyy-MM-dd");
		Date B = Q.parse(s1);
		System.out.println(B);
		Calendar W = Calendar.getInstance();
		W.setTime(B);
		long ms=B.getTime();
		System.out.println((now-ms)/1000/60/60/24);
	}

}
