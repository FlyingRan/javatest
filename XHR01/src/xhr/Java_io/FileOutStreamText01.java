package xhr.Java_io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutStreamText01 {

	public static void main(String[] args) {
		FileOutputStream fos =null;
		try {
			//������true��ʱ�򣬲��Ḳ��֮ǰ���ļ�
			fos = new FileOutputStream("xsg.txt",true);//���û������ļ������Զ��������еĻ��Ḳ��
			fos.write("\n".getBytes());
			fos.write("xhrshigeshuige".getBytes());
			fos.write("\n".getBytes());
			fos.write("i love you".getBytes());
			fos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
