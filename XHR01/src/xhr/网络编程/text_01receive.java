package xhr.ÍøÂç±à³Ì;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class text_01receive {

	public static void main(String[] args) throws Exception {
		DatagramSocket socket = new DatagramSocket(8888);
		DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
		socket.receive(packet);
		byte[] arr = packet.getData();
		int len = packet.getLength();
		System.out.println(new String(arr,0,len));
		socket.close();
	}

}
