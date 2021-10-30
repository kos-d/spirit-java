package books.promdev.part_02_libraries.chapt09.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadDemo {
	public static void main(String[] args) {
		File f = new File("file.txt");
		
		int b, count = 0;
		try {
			//FileReader is = new FileReader(f);
			FileInputStream is = new FileInputStream(f);
			while ((b = is.read()) != -1) {
				System.out.print((char)b);
				count++;
			}
			is.close();
		} catch (IOException e) {
			System.err.println("error file: " + e);
		}
		System.out.print("\n count byte = " + count);
	}
}