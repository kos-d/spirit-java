
import java.io.*;

public class DemoSerialization {
	public static void main(String[] args) {
		Student gonzales = new Student("PGS", "Gonza", 1, "G017s9");
		System.out.println(gonzales);
		
		File fw = new File("demo.dat");
		try {
			ObjectOutputStream ostream = 
				new ObjectOutputStream(
					new FileOutputStream(fw));
			ostream.writeObject(gonzales);
			ostream.close();
		} catch (IOException e) {
			System.err.println(e);
		}
		Student.faculty = "GEO";
		
		File fr = new File("demo.dat");
		try {
			ObjectInputStream istream =
				new ObjectInputStream(
					new FileInputStream(fr));
			Student unknown = (Student) istream.readObject();
			istream.close();
			System.out.println(unknown);
		} catch (ClassNotFoundException ce) {
			System.err.println(ce);
			System.err.println("class no exists");
		} catch (FileNotFoundException fe) {
			System.err.println(fe);
			System.err.println("file not found");
		} catch (IOException ioe) {
			System.err.println(ioe);
			System.err.println("error access");
		}
	}
}