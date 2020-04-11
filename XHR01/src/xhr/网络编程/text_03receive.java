package xhr.网络编程;


import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class text_03receive {

	public static void main(String[] args) throws Exception {
		DatagramSocket socket = new DatagramSocket(5555);
		
		DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
		
		socket.receive(packet);
		byte[] arr = packet.getData();
		int len = packet.getLength();
		String str = new String(arr,0,len);
		
		String ip  = packet.getAddress().getHostAddress();//获取IP地址
		int port = packet.getPort();//获取端口号
		System.out.println(ip + " : " + port+":"+str);
	
		
		
			
	}

}
