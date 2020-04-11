package xhr.网络编程;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class text_02send {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		DatagramSocket socket = new DatagramSocket();//创建socket相当于创建码头
		while(true) {
			String str = sc.nextLine();
			if("stop".equals(str)) {
				break;
			}
			DatagramPacket packet =						 //创建packet相当于创建集装箱
				new DatagramPacket(str.getBytes(), str.getBytes().length, InetAddress.getByName("127.0.0.1"), 8888);
			socket.send(packet);						 //发货（将数据发出去）
		}
		socket.close();
	}

}
