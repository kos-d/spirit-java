
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;
import java.util.zip.Deflater;

public class PackJar {
	public static void pack(String[] filesToJar,
					String jarFileName, byte[] buffer) {
		try {
			JarOutputStream jos = 
				new JarOutputStream(
					new FileOutputStream(jarFileName));
			jos.setLevel(Deflater.DEFAULT_COMPRESSION);
			for (int i = 0; i < filesToJar.length; i++) {
				System.out.println(i);
			jos.putNextEntry(new JarEntry(filesToJar[i]));
			
			FileInputStream in =
				new FileInputStream(filesToJar[i]);
			int len;
			while ((len = in.read(buffer)) > 0)
				jos.write(buffer, 0, len);
			jos.closeEntry();
			in.close();
			}
			jos.close();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			System.err.println("Wrong argument");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.err.println("File not found");
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println("Error access");
		}
	}
	public static void main(String[] args) {
		System.out.println("Create jar-archive");
		
		String[] filesToJar = new String[2];
		//filesToJar[0] = "chapt09//UseJar.java";
		//filesToJar[1] = "chapt09//UseJar.class";
		filesToJar[0] = "UseJar.java";
		filesToJar[1] = "UseJar.class";
		byte[] buffer = new byte[1024];
		
		String jarFileName = "example.jar";
		pack(filesToJar, jarFileName, buffer);
	}
}