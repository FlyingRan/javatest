package xhr.������;


import java.net.*;
import java.io.*;
 
public class textreceive {
 
    private ServerSocket server;
    private Socket client;
 
    public textreceive() {
        boolean flag = true;
        try {
            server = new ServerSocket(8888);    //�˿�
            System.out.println("���������ڵȵ��ͻ�������......");
            while (flag) {
                client = server.accept();   //����
                new ServerThread(client).start();
            }
            server.close();
        } catch (Exception e) {
        }
    }
 
    public static void main(String[] args) {
        new textreceive();
    }
 
    private class ServerThread extends Thread {
 
        private Socket clientThread;
        private PrintStream out;
        private BufferedReader in;
        private boolean flag = true;
 
        public ServerThread(Socket client) {
            this.clientThread = client;
            System.out.println("������ͻ��˳ɹ��������ӣ���ʼͨѶ����");
        }
 
        public void run() {
            try {
                /*
                 * ��ʱ�жϣ����ó�ʱʱ��300�룬�ж����ӻ���300���ڿͻ����޻�Ӧ��Ϣ����Ϊ�ж�
                 * ȱ����Ǳ���ѳ�ʱʱ�����úܳ�������ͻ��˴���Ҳ��Ϊ��ʱ�����޷��ж��Ƿ�˿�
                 */
                clientThread.setSoTimeout(300000);
                out = new PrintStream(client.getOutputStream());
                in = new BufferedReader(new InputStreamReader(client.getInputStream()));
                while (flag) {
                    String str = in.readLine(); //����
                    System.out.println("�ͻ��ˣ�" + str);
                    out.println("�����ɹ����յ�������Ϣ����");
                }
                client.close();
            } catch (Exception e) {
                //����쳣�������쳣����������ӶϿ�
                if (e.getMessage() == "Connection reset") {
                    System.out.println("�ͻ����ѶϿ����ӣ���");
                }
            }
        }
    }
}