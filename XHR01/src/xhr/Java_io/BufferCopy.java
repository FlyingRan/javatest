package xhr.Java_io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;	
import java.io.FileWriter;
import java.io.IOException;

public class BufferCopy {

	public static void main(String[] args) {
		try (BufferedReader fr = new BufferedReader(new FileReader("xhr.txt"));
			BufferedWriter fw = new BufferedWriter(new FileWriter("file1" + File.separator + "xxm.txt"));) {
				String mg;
				while((mg=fr.readLine())!=null) {
					fw.write(mg);
					fw.newLine();
				}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}

}
