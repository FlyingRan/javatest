package xhr.Java_io;

import java.io.File;
import java.io.RandomAccessFile;

public class fileText01 {

	public static void main(String[] args) throws Exception {
		File f = new File("d:"+File.separator+"xhrText.txt");
		RandomAccessFile raf = new RandomAccessFile(f,"rw");//������������ļ�Ϊ��д
		long filepoint= 0;
		long fileLength = raf.length();//��ȡ�ļ�����
		while(filepoint<fileLength) {
			String str = raf.readLine();//���ļ��а��ж�ȡ
			System.out.println(str);
			filepoint = raf.getFilePointer();
		}
		raf.close();
	}
	
}
