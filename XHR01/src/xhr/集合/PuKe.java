package xhr.集合;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PuKe {

	public static void main(String[] args) {
		
		String[] num = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String[] colar = {"方块","红桃","黑桃","梅花"};
		List<String> l = new ArrayList();
		for(int i=0;i<num.length;i++) {
			for(int j = 0;j<colar.length;j++)
				l.add(colar[j]+num[i]);
		}
		l.add("大王");
		l.add("小王");
		System.out.println(l);
		Collections.shuffle(l);
		ArrayList<String> xhr = new ArrayList<>();
		ArrayList<String> xhd = new ArrayList<>();
		ArrayList<String> xhb = new ArrayList<>();
		ArrayList<String> dipai = new ArrayList<>();
		for(int i=0;i<l.size();i++) {
			if(i>=l.size()-3) break;
			if(i%3==0) xhr.add(l.get(i));
			if(i%3==1) xhd.add(l.get(i));
			if(i%3==2) xhb.add(l.get(i));
		}
		for(int i=l.size()-3;i<l.size();i++)
			dipai.add(l.get(i));
		System.out.println(xhr);
		System.out.println(xhd);
		System.out.println(xhb);
		System.out.println(dipai);
		//洗牌与发牌完成
	
		
	}

}
