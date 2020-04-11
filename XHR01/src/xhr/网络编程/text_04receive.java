package xhr.网络编程;


import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class text_04receive {

	public static void main(String[] args) throws Exception {
		new receive1().start();
		new send1().start();	
	}

}
class send1  extends Thread {
	  
	   public void run() {
			try {
				Scanner sc = new Scanner(System.in);
				DatagramSocket socket = new DatagramSocket();//创建socket相当于创建码头
				while (true) {
					String str = sc.nextLine();
					if ("stop".equals(str)) {
						break;
					}
					DatagramPacket packet = //创建packet相当于创建集装箱
							new DatagramPacket(str.getBytes(), str.getBytes().length,
									InetAddress.getByName("127.0.0.1"), 3333);
					socket.send(packet); //发货（将数据发出去）
				}
				socket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
}
	class receive1 extends Thread{
	
		public void run() {
			try {
				DatagramSocket socket = new DatagramSocket(3333);
				while (true) {
					DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);

					socket.receive(packet);
					byte[] arr = packet.getData();
					int len = packet.getLength();
					String str = new String(arr, 0, len);
					if (str.equals("stop")) {
						break;
					}
					String ip = packet.getAddress().getHostAddress();//获取IP地址
					int port = packet.getPort();//获取端口号
					System.out.println(ip + " : " + port + ":" + str);
				} 
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}