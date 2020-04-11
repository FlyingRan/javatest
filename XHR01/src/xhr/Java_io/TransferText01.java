package xhr.Java_io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TransferText01 {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("utf-8.txt"));
				BufferedWriter bw = new BufferedWriter(new FileWriter("gbk.txt"));){
			String mg;
			while((mg = br.readLine()) !=null) {
				bw.write(mg);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}

}
