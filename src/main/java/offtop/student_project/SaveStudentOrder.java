package offtop.student_project;

public class SaveStudentOrder {
    public static void main(String[] args) {
        
        StudentOrder so;
        so = new StudentOrder();
        so.hFirstName = "Alex";
        so.hLastName = "Petrov";
        so.wFirstName = "Galina";
        so.wLastName = "Petrova"; 
        
        long ans = saveStudentOrder(so);
        System.out.println(ans);
        
    }
    
    static long saveStudentOrder(StudentOrder  studentOrder) {
        long answer = 199;
        System.out.println("saveStudentOrder: " + studentOrder.hLastName);
        
        return answer;
    }
}
