package offtop.student_project;

public class StudentOrderValidator {

//    public static void main(String[] args) {
//        checkAll();
//    }

//    static void checkAll() {
//        StudentOrder so = readStudentOrder();
//
//        while () {
//            if (so == null) {
//                return;
//            } else {
//                AnswerCityRegister cityAnswer = checkCityRegister(so);
//                AnswerWedding wedAnswer = checkWedding(so);
//                AnswerChildren childAnswer = checkChildren(so);
//                AnswerStudent studentAnswer = checkStudent(so);
//
//                sendMail(so);
//            }
//        }
//    }

    static StudentOrder readStudentOrder() {
        StudentOrder so = new StudentOrder();
        return so;
    }

    static AnswerCityRegister checkCityRegister(StudentOrder so) {
        System.out.println("CityRegister is running");
        AnswerCityRegister ans = new AnswerCityRegister();
        return ans;
    }

    static AnswerWedding checkWedding(StudentOrder so) {
        System.out.println("Wedding is running");
        return new AnswerWedding();
    }

    static AnswerChildren checkChildren(StudentOrder so) {
        System.out.println("Children Check is running");
        return new AnswerChildren();
    }

    static AnswerStudent checkStudent(StudentOrder so) {
        System.out.println("Students checked");
        return new AnswerStudent();
    }

    static void sendMail(StudentOrder so) {
        System.out.println("Mail send");
    }
}
