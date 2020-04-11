package xhr.Java_io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
//这是转换流，转换编码
public class TransferText02 { 

	public static void main(String[] args) {
		
		try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("gbk.txt"),"gbk"));
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("utf-8.txt"),"utf-8"));) {
			
			String mg ;
			while((mg = br.readLine())!=null) {
				bw.write(mg);
			}
		} catch (UnsupportedEncodingException | FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
