package xhr.Java_io;

import java.io.File;
import java.io.FilenameFilter;

public class FilenameFilterText {

	public static void main(String[] args) {
		File file = new File("D:\\java´úÂë");
		String[] namearr = file.list(new FilenameFilter(){
					public boolean accept(File dir, String name) {
						File file1= new File(dir,name);
						System.out.println(dir+"||||"+name);
						return file1.isFile()&&file1.getName().endsWith(".class");
					}
				});
		for(String s : namearr) {
			System.out.println(s);
		}
		System.out.println(namearr.length);
	}

}
