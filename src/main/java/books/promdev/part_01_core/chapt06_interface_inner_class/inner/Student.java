package books.promdev.part_01_core.chapt06_interface_inner_class.inner;

public class Student {
    private int id;
    private ExamResult[] exams;
    
    public Student(int id) {
        this.id = id;
    }
    
    private class ExamResult {
        private String name;
        private int mark;
        private boolean passed;
        
        public ExamResult(String name) {
            this.name = name;
            passed = false;
        }
        public void passExam() {
            passed = true;
        }
        public void setMark(int mark) {
            this.mark = mark;
        }
        public int getMark() {
            return mark;
        }
        public int getPassedMark() {
            final int PASSED_MARK = 4;
            return PASSED_MARK;
        }
        public String getName() {
            return name;
        }
        public boolean isPassed() {
            return passed;
        }
    }
    public void setExam(String[] name, int[] marks) {
        if (name.length != marks.length) throw new IllegalArgumentException();
        exams = new ExamResult[name.length];
        for (int i = 0; i < name.length; i++) {
            exams[i] = new ExamResult(name[i]);
            exams[i].setMark(marks[i]);
            if (exams[i].getMark() >= exams[i].getPassedMark())
                exams[i].passExam();
        }
    }
    @Override
    public String toString() {
        String res = "Student: " + id + "\n";
        for (int i = 0; i < exams.length; i++) 
            if (exams[i].isPassed())
                res += exams[i].getName()+ ":" + " complete \n";
            else
                res += exams[i].getName() + ":" + " no complete \n";
        return res;
    }
}