package xhr.¼¯ºÏ;

import java.util.Comparator;

public class Compare2 implements Comparator<Character> {

	@Override
	public int compare(Character o1, Character o2) {
		int num = o1-o2;
		if(num == 0 )
			return 1;
		else
			return num;
	}

	
}
