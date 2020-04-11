package xhr.����;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Eshopcar {
	Map<Eproduct,Integer> product;//���ڴ����Ʒ���༰������
	 BigDecimal total= new BigDecimal(0.0);
	public Eshopcar() {
		product = new HashMap<>();
	}
	//�����Ʒ
	public void add(Eproduct p , int num) {
		if(!product.containsKey(p)) {
			product.put(p, num);
		}else {
			int value = product.get(p);
			product.put(p, value+num);
		}
		
		total = total.add(p.getPrice().multiply(BigDecimal.valueOf(num)));
	}
	//ɾ����Ʒ
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
	//��չ��ﳵ
	public void clear() {
		product.clear();
		total = BigDecimal.valueOf(0.0);
	}
	//��ӡ
	public void print() {
		Set<Eproduct> s = product.keySet();
		Iterator<Eproduct> it = s.iterator();
		while(it.hasNext()) {
			Eproduct p = (Eproduct)it.next();
			int i = product.get(p);
			System.out.println("��������"+p.getName()+i+"��"+"������"+p.getPrice().multiply(BigDecimal.valueOf(i))+"Ԫ");
		}
		System.out.println("ȫ����Ʒ����"+total+"Ԫ");
	}
}
