package xhr.网络编程;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class text_01send {

	public static void main(String[] args) throws Exception {
		String str = "wo shi  xuhaoran!!!";
		DatagramSocket socket = new DatagramSocket();//创建socket相当于创建码头
		DatagramPacket packet =						 //创建packet相当于创建集装箱
				new DatagramPacket(str.getBytes(), str.getBytes().length, InetAddress.getByName("118.251.169.190"), 8888);
		socket.send(packet);						 //发货（将数据发出去）
		socket.close();
	}

}
