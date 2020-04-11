package xhr.Java_io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterText01 {

	public static void main(String[] args) {

		try(FileWriter fr = new FileWriter("file1"+File.separator+"shr.txt");) {
			fr.write("ºÃºÃÑ§Ï°");
			fr.append('n');
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
