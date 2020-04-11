package xhr.集合;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Eshopcar {
	Map<Eproduct,Integer> product;//用于存放商品种类及其数量
	 BigDecimal total= new BigDecimal(0.0);
	public Eshopcar() {
		product = new HashMap<>();
	}
	//添加商品
	public void add(Eproduct p , int num) {
		if(!product.containsKey(p)) {
			product.put(p, num);
		}else {
			int value = product.get(p);
			product.put(p, value+num);
		}
		
		total = total.add(p.getPrice().multiply(BigDecimal.valueOf(num)));
	}
	//删除商品
	public void delete(Eproduct p , int num) {
		int i = product.get(p);
		if(num<=i) {
			product.remove(p);
			total = total.subtract(p.getPrice().multiply(BigDecimal.valueOf(i)));
		}else if(num>i){
			product.put(p, num-i);
			total = total.subtract(p.getPrice().multiply(BigDecimal.valueOf(num)));
		}
	}
	//清空购物车
	public void clear() {
		product.clear();
		total = BigDecimal.valueOf(0.0);
	}
	//打印
	public void print() {
		Set<Eproduct> s = product.keySet();
		Iterator<Eproduct> it = s.iterator();
		while(it.hasNext()) {
			Eproduct p = (Eproduct)it.next();
			int i = product.get(p);
			System.out.println("您购买了"+p.getName()+i+"件"+"，共计"+p.getPrice().multiply(BigDecimal.valueOf(i))+"元");
		}
		System.out.println("全部商品共计"+total+"元");
	}
}
