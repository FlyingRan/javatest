package xhr.Java_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CodeText {

	public static void main(String[] args) {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			fis = new FileInputStream("xhr.png");
			fos = new FileOutputStream("xhr.png");
			int temp;
			while((temp=fis.read())!=-1) {
				fos.write(temp^88);//���ܣ����ܵĻ������һ�ξ��У����������ڱ���
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		}

	}

}
