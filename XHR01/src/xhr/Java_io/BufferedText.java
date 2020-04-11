package xhr.Java_io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedText {
	public static void main(String[] args) {
		BufferedInputStream bis=null;
		BufferedOutputStream bos=null;
		try {
		    bis= new BufferedInputStream (new FileInputStream("xsg.txt"));
			bos= new BufferedOutputStream(new FileOutputStream("file1"+File.separator+"file.txt"));
			byte[] b = new byte[3];
			int temp;
			while((temp=bis.read(b))!=-1) {
				bos.write(b, 0, temp);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bis.close();
				bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		}
		
	}
}
