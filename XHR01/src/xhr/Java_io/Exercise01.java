package xhr.Java_io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exercise01 {

	public static void main(String[] args) {
		try(BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("sycs.txt"));) {
		bos.write(3^66);bos.write(3^66);
		bos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}

}
