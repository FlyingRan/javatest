package xhr.网络编程;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Frame01 extends Frame{

	private TextArea viewText;
	private TextArea sendText;
	private TextField tf;
	private Button send;
	private Button log;
	private Button clear;
	private Button shake;
	private DatagramSocket socket;
	public Frame01() {
		init();
		southPanel();
		centerPanel();
		enent();
	}
	private void enent() {
		this.addWindowListener(
				new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						socket.close();
						System.exit(0);
					}
				} 
				);
		send.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					send();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}

			});
	}
	private void send() throws Exception {
		String message = sendText.getText();
		String  ip = tf.getText();
		
		DatagramPacket packet = 
				new DatagramPacket(message.getBytes(), message.getBytes().length,InetAddress.getByName(ip),5678);
		socket.send(packet);                                      //发送数据
		
		String time = getCurrrndTime();
		viewText.append(time+ " 我对" + ip + "说\r\n" + message + "\r\n\r\n");
		sendText.setText("");
		
	
	}

	private String getCurrrndTime() {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日   HH：mm ：ss");
		return sdf.format(d);
	}
	private void centerPanel() {
		Panel center = new Panel();
		viewText = new TextArea();
		sendText = new TextArea(5,2);
		center.setLayout(new BorderLayout());              //设置为边界布局管理器，就是扩充到边上    
		center.add(sendText,BorderLayout.SOUTH);
		center.add(viewText,BorderLayout.CENTER);
		viewText.setEditable(false);
		viewText.setBackground(Color.white);
		viewText.setFont(new Font("xxx",Font.PLAIN,15));
		sendText.setFont(new Font("xxx",Font.PLAIN,15));
		this.add(center,BorderLayout.CENTER);
	}
	private void southPanel() {
		Panel south = new Panel();
		tf = new TextField(20);
		tf.setText("113.221.152.58");
		send = new Button("发送");
		log = new Button("记录");
		clear = new Button("清屏");
		shake = new Button("震动");
		south.add(tf);
		south.add(send);
		south.add(log);
		south.add(clear);
		south.add(shake);
		this.add(south,BorderLayout.SOUTH);
	}
	private void init() {
		this.setLocation(300,100);
		this.setSize(500,500);
		new Receive().start();
		try {
			socket = new DatagramSocket();
		} catch (SocketException e) {
			e.printStackTrace();
		}
		this.setVisible(true);
	}
	private class Receive extends Thread{
		public void run() {
			try {
				DatagramSocket socket = new DatagramSocket(2345);
				DatagramPacket packet = new DatagramPacket(new byte[7777], 7777);
				while(true) {
				socket.receive(packet);
				byte[] arr = packet.getData();
				int len = packet.getLength();                     //获取有效字节数据
				String message = new String (arr,0,len);
				String time = getCurrrndTime();                   //获取当前时间
				String ip = packet.getAddress().getHostAddress(); //获取IP地址
				viewText.append(time + " " + ip + " 对我说：\r\n" +message+"\r\n");
				} 
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		}
	}
	public static void main(String[] args) {
		new Frame01();
	}

}
