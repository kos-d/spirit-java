package books.promdev.part_02_libraries.chapt08;

import java.io.FileNotFoundException;
import java.io.IOException;

class SocketInput extends FileInput {
	public SocketInput(String name) throws FileNotFoundException {
		super(name);
		// to do
	}
	public SocketInput() throws IOException {
		super("file.txt");
		// to do
	}
	public SocketInput(String name, int mode) throws FileNotFoundException {
		super(name);
		// to do
	}
}