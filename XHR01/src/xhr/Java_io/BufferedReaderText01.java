package xhr.Java_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderText01 {
//这是缓冲输入流，输出流类似，但是输出流多了一个换行的方法
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("xhr.txt"));){
			String mg;
			while((mg = br.readLine())!=null) {
				System.out.println(mg);
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
