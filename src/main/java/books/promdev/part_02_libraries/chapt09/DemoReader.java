
import java.io.*;

public class DemoReader {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("res.txt"));
			String tmp = "";
			while((tmp = br.readLine()) != null) {
				String[] s = tmp.split("\\s");
				for (String res : s)
					System.out.println(res);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}