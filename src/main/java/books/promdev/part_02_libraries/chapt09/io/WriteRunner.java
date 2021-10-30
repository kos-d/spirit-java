package books.promdev.part_02_libraries.chapt09.io;

import java.io.*;

public class WriteRunner {
	public static void main(String[] args) {
		String pArray[] = { "2007 ", "Java SE 6" };
		File fbyte = new File("byte.txt");
		File fsymb = new File("symbol.txt");
		
		try {
			FileOutputStream fos = new FileOutputStream(fbyte);
			FileWriter fw = new FileWriter(fsymb);
			for (String a : pArray) {
				fos.write(a.getBytes());
				fw.write(a);
			}
			fos.close();
			fw.close();
		} catch (IOException e) {
			System.err.println("error file: " + e);
		}
	}
}