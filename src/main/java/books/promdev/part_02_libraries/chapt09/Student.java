
import java.io.*;

class Student implements Serializable {
	protected static String faculty;
	private String name;
	private int id;
	private transient String password;
	private static final long serialVersionUID = 1L;
	
	public Student(String nameOfFaculty, String name,
			int id, String password) {
				faculty = nameOfFaculty;
				this.name = name;
				this.id = id;
				this.password = password;
			}
	public String toString() {
		return "\nfaculty " + faculty + "\nname " + name
				+ "\nID " + id + "\npassword " + password;
	}
}