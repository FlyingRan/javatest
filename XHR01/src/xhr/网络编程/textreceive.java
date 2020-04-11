package xhr.网络编程;


import java.net.*;
import java.io.*;
 
public class textreceive {
 
    private ServerSocket server;
    private Socket client;
 
    public textreceive() {
        boolean flag = true;
        try {
            server = new ServerSocket(8888);    //端口
            System.out.println("服务器正在等到客户端连接......");
            while (flag) {
                client = server.accept();   //阻塞
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
            System.out.println("主机与客户端成功建立连接，开始通讯！！");
        }
 
        public void run() {
            try {
                /*
                 * 超时判断：设置超时时间300秒，中断连接或者300秒内客户端无回应信息则认为中断
                 * 缺点便是必须把超时时间设置很长，否则客户端待机也认为超时处理，无法判断是否端口
                 */
                clientThread.setSoTimeout(300000);
                out = new PrintStream(client.getOutputStream());
                in = new BufferedReader(new InputStreamReader(client.getInputStream()));
                while (flag) {
                    String str = in.readLine(); //阻塞
                    System.out.println("客户端：" + str);
                    out.println("主机成功接收到您的信息！！");
                }
                client.close();
            } catch (Exception e) {
                //如果异常是连接异常，则输出连接断开
                if (e.getMessage() == "Connection reset") {
                    System.out.println("客户端已断开连接！！");
                }
            }
        }
    }
}