package xhr.网络编程;

import java.net.*;
import java.io.*;
 
public class textsend {
 
    private Socket client;
 
    public textsend() {
        try {
            System.out.println("正在连接服务器......");
 
            client = new Socket("58.45.195.223", 8888);    //阻塞
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            PrintStream out = new PrintStream(client.getOutputStream());;
            boolean flag = true;
 
            System.out.println("成功连接到主机，开始通讯！！");
 
            while (flag) {
                System.out.printf("请输入信息：");
                out.println(input.readLine());  //阻塞
                //判断是否与主机断开
                if (isConnected()) {
                    System.out.println("发生成功！！");
                    System.out.println("主机：" + in.readLine());
                } else {
                    System.out.println("发生失败！！");
                    System.out.println("与服务器断开连接！！");
                    client.close();
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
 
    //判断服务器是否断开的方法，
    //通过OutputStream发送一段测试数据，如果发送失败就表示远端已经断开连接
    //但会与正常的传送干扰，所以用sendUrgenData
    public boolean isConnected() {
        try {
            client.sendUrgentData(0xFF);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
 
    public static void main(String[] args) {
        new textsend();
    }
}
