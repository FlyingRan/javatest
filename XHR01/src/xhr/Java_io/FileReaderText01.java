package xhr.Java_io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderText01 {

	public static void main(String[] args) {
		try(FileReader fr = new FileReader("xhr.txt");) {
			int msg;
			while((msg=fr.read())!=-1) {
				System.out.println((char)msg);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}

}
