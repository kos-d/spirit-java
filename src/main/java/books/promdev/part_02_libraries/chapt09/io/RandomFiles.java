package books.promdev.part_02_libraries.chapt09.io;

import java.io.*;

public class RandomFiles {
	public static void main(String[] args) {
		double data[] = { 1, 10, 50, 200, 5000 };
		try {
			RandomAccessFile rf = new RandomAccessFile("temp.txt", "rw");
			for (double d : data)
				rf.writeDouble(d);
			for (int i = data.length - 1; i >= 0; i--) {
				rf.seek(i * 8);
				System.out.println(rf.readDouble());
			}
			rf.close();
		} catch (IOException e) {
			System.err.println(e);
		}
	}
}