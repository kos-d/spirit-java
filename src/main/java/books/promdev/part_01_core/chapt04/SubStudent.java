package books.promdev.part_01_core.chapt04;

public class SubStudent extends Student {
    private int idFaculty;
    
    public SubStudent(int id, String n, int a, int idf) {
        super(id, n, a);
        this.idFaculty = idf;
    }
}