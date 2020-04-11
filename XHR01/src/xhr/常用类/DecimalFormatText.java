package xhr.≥£”√¿‡;

import java.text.DecimalFormat;

public class DecimalFormatText {
	public static void main(String[] args) {
		String s = DecimalFormat.getCurrencyInstance().format(123456);
		System.out.println(s);
		DecimalFormat b = new DecimalFormat("###,###,000");
		System.out.println(b.format(123458.90));
	}
}
