package xhr.Java_io;

import java.io.File;
import java.io.RandomAccessFile;

public class fileText01 {

	public static void main(String[] args) throws Exception {
		File f = new File("d:"+File.separator+"xhrText.txt");
		RandomAccessFile raf = new RandomAccessFile(f,"rw");//创建随机访问文件为读写
		long filepoint= 0;
		long fileLength = raf.length();//获取文件长度
		while(filepoint<fileLength) {
			String str = raf.readLine();//从文件中按行读取
			System.out.println(str);
			filepoint = raf.getFilePointer();
		}
		raf.close();
	}
	
}
