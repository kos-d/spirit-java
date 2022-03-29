package offtop.anonymous;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.function.Consumer;

public class AnonymousExample {
    
    public void nonStaticMethod() {
        Consumer<String> foo = new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println(o + " TODO something useful!");
            }
        };
        
        foo.accept("Work anonymous class in NON static method");
        
        Constructor[] constructors = foo.getClass().getDeclaredConstructors();
        
        Object[] params = new Object[1];
        params[0] = this;
        
        Consumer otherInstance = null;
        
        try {
            otherInstance = (Consumer) constructors[0].newInstance(params);
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InvocationTargetException ex) {
            ex.printStackTrace();
        }
        otherInstance.accept("Work second instance anonymous class in NON static method");
    }
    
    public static void main(String[] args) {
        AnonymousExample anon = new AnonymousExample();
        anon.nonStaticMethod();
    }
}