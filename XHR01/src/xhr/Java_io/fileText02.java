package xhr.Java_io;

import java.io.File;

import java.io.RandomAccessFile;

public class fileText02 {

	public static void main(String[] args) throws Exception {
		int[] arr = {10,20,30,40,50,60,720};
		RandomAccessFile ra = new RandomAccessFile("d:"+File.separator+"xhrText.txt","rw");
		
		
		for(int i=0;i<arr.length;i++) {
			ra.writeInt(arr[i]);
		}
		for(int i = arr.length-1;i>=0;i--) {
			ra.seek(i*4);
			System.out.print(ra.readInt()+"\t");
		}
		ra.close();
	}
}
