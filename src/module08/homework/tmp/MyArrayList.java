package module08.homework.tmp;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList<E>  extends MyAbstractList<E> 
        implements MyList<E>, MyRandomAccess, MyCloneable, MySerializable {
    
    private static final int DEFAULT_CAPACITY = 10;
    
    private static final Object [] EMPTY_ELEMENTDATA = {};

    @Override
    public boolean add(Object value) {
        throw new MyUnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E remove(int index) {
        throw new MyUnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        throw new MyUnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        throw new MyUnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E get(int index) {
        throw new MyUnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public MyIterator<E> iterator() {
        throw new MyUnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }   
    
}