package xhr.������;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class text_01send {

	public static void main(String[] args) throws Exception {
		String str = "wo shi  xuhaoran!!!";
		DatagramSocket socket = new DatagramSocket();//����socket�൱�ڴ�����ͷ
		DatagramPacket packet =						 //����packet�൱�ڴ�����װ��
				new DatagramPacket(str.getBytes(), str.getBytes().length, InetAddress.getByName("118.251.169.190"), 8888);
		socket.send(packet);						 //�����������ݷ���ȥ��
		socket.close();
	}

}
