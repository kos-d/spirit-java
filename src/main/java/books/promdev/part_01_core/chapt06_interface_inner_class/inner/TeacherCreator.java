package books.promdev.part_01_core.chapt06_interface_inner_class.inner;

public class TeacherCreator {
    public TeacherCreator() {}
    
    public AbstractTeacher createTeacher(int id) {
        class Dean extends AbstractTeacher {
            Dean(int id) {
                super(id);
            }
            @Override
            public boolean excludeStudent(String name){
                if (name != null) {
                    return true;
                }
                else return false;
            }
        }
        if (isDeanId(id))
            return new Dean(id);
        else return new Teacher(id);
    }
    private static boolean isDeanId(int id) {
        return (id == 777);
    }

}