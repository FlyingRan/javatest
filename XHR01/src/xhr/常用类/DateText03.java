package xhr.≥£”√¿‡;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateText03 {

	public static void main(String[] args) throws ParseException {
		String s = "2019-01-01";
		SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd");
		Date c = a.parse(s);
		System.out.println(c);
	}

}
