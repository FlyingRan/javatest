package xhr.Java_io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exercise02 {
	public static void main(String[] args) {
		try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("sycs.txt"));) {
			int temp = bis.read();
			int count = temp^66;
			if(count>0&&count<=3) {
				count--;
				System.out.println("您的使用次数还剩"+count);
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("sycs.txt"));
				bos.write(count^66);
				bos.flush();
			}else {
					System.out.println("次数受限");
			}
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
