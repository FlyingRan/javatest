package xhr.����;

import java.math.BigDecimal;

public class Exerciseshop {

	public static void main(String[] args) {
		Eshopcar car = new Eshopcar();
		Eproduct colo = new Eproduct("101","�ɿڿ���",BigDecimal.valueOf(2.5));
		Eproduct brush = new Eproduct("102","ˢ��",BigDecimal.valueOf(5.0));
		Eproduct bread = new Eproduct("101","���",BigDecimal.valueOf(7.0));
		Eproduct computer = new Eproduct("101","����",BigDecimal.valueOf(5500.0));
		Eproduct keyboard = new Eproduct("101","����",BigDecimal.valueOf(72.0));
		car.clear();
		car.add(keyboard, 2);
		car.add(computer, 1);
		car.add(bread, 15);
		car.add(brush, 3);
		car.add(colo, 3);
		car.delete(bread, 10);
		car.print();
	}

}
