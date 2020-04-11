package xhr.Java_io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutStreamText01 {

	public static void main(String[] args) {
		FileOutputStream fos =null;
		try {
			//当传入true的时候，不会覆盖之前的文件
			fos = new FileOutputStream("xsg.txt",true);//如果没有这个文件，会自动创建，有的话会覆盖
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
