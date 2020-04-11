package xhr.Java_io;

import java.io.File;
import java.util.Scanner;

public class FileNameText01 {

	private static int space=0;
	public static void main(String[] args) {
		File file = getFile();
		
		setFile(file);
	}

	private static void setFile(File file) {
		File[] farr = file.listFiles();
	
		for(int i =farr.length-1;i>=0;i--) {
			for(int j =0 ; j<space ;j++)
				System.out.print("\t");
			if(farr[i].isDirectory()) {
				space++;
				System.out.println(farr[i].getName());
				setFile(farr[i]);
				space--;
			}
			else {
				System.out.println(farr[i].getName());
			
			}
		}
	}

	private static File getFile() {
		Scanner sc = new Scanner(System.in);
		while(true) {
		String str = sc.next();
		File f = new File(str);
		if(!f.exists()) {
			System.out.println("输入有误，请输入正确的文件夹路径");
		}else if(f.isFile()){
			System.out.println("输入有误，请输入正确的文件夹路径");
		}else {
			return f;
		}
		}
	}

}
