package module06.homework.autocheck;

class ObjectWorkerTest {
    public static void main(String[] args) {
        Object[] data = {"Hello", 20l, 3.14f, true};
        
        System.out.println(new ObjectWorker().join(data));
    }
}
class ObjectWorker {
    public String join(Object[] objects) {
        StringBuilder result = new StringBuilder();
        //String result = "";
        for(int i = 0; i < objects.length; i++) {
            //result += objects[i];
            result.append(objects[i]);
            
            if (i != objects.length - 1) {
                //result += " ";
                result.append(" ");
            }
        }
        return result.toString();
    }
}
/*
class ObjectWorker {
    public String join(Object[] objects) {
        String result = "";
        for(int i = 0; i < objects.length; i++) {
            result += objects[i];
            
            if (i != objects.length - 1) {
                result += " ";
            }
        }
        return result;
    }
}
*/