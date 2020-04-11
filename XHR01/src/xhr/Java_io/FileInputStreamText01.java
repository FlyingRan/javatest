package xhr.Java_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamText01 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("D:\\java´úÂë\\XHR01\\xhr.txt");
			byte[] b = new byte[2];
			/*
			 * int temp; while((temp=fis.read()) !=-1) { System.out.println(temp); }
			 */
			int temp;
			while((temp=fis.read(b))!=-1) {
				System.out.print(new String(b,0,temp));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}

	}

}
