package xhr.������;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class text_03send {

	public static void main(String[] args) throws Exception {
			Scanner sc = new Scanner(System.in);
		
			DatagramSocket socket = new DatagramSocket();//����socket�൱�ڴ�����ͷ
			while(true) {
			String str = sc.nextLine();
			
			DatagramPacket packet =						 //����packet�൱�ڴ�����װ��
				new DatagramPacket(str.getBytes(), str.getBytes().length, InetAddress.getByName("113.221.152.58"),5678);
			socket.send(packet);						 //�����������ݷ���ȥ��
			}
			
	}

}
