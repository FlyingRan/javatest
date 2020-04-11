package xhr.Java_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			fis = new FileInputStream("xsg.txt");
			fos = new FileOutputStream("file1"+File.separator+"file.txt");
			byte[] b = new byte[3];
			int temp;
			while((temp=fis.read(b))!=-1) {
				fos.write(b, 0, temp);
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
