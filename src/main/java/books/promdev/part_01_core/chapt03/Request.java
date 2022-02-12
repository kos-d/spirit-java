//package books.promdev.part_01_core.chapt03;
//
//import java.lang.reflect.Method;
//
//public class Request {
//    @RequestForCustomer (level = 2,
//                         description = "Enable time",
//                         date = "14/09/2021" )
//    
//    public void customerThroughTime() {
//        try {
//        Class c = this.getClass();
//        Method m = c.getMethod("customerThroughTime");
//        RequestForCustomer ann = 
//                m.getAnnotation(RequestForCustomer.class);
//                System.out.println(ann.level() + " " 
//                        + ann.description() + " " 
//                        + ann.date());
//        } catch (NoSuchMethodException e) {
//            System.out.println("Method not found");
//        }
//    }
//    public static void main(String[] args) {
//        Request ob = new Request();
//        ob.customerThroughTime();
//    }
//}