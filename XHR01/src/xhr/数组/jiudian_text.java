package xhr.数组;

import java.util.Scanner;

public class jiudian_text {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("欢迎使用许浩然制作的酒店管理系统！");
		jiudian_hotel b = new jiudian_hotel();
		b.print();
		while(true) {
		System.out.println("请输出您的操作 ： 1.预定房间  2.退房 3.退出系统");
		int action = a.nextInt();
		if(action==1) {
			System.out.println("请输入您所需要预定的房间号！");
			String s= a.next();
			b.order(s);
		}
		else if(action==2) {
			System.out.println("请输入您所需要退订的房间号！");
			String s= a.next();
			b.out(s);
		}
		else {
			System.out.println("退出系统成功，欢迎下次再来！");
			break;
		}
		}
		a.close();
	}
}
