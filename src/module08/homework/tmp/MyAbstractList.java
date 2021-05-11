package module08.homework.tmp;

public abstract class MyAbstractList<E> extends MyAbstractCollection<E> implements MyList<E> {
    
    protected MyAbstractList() {
    }
    
    @Override
    public boolean add(E e) {
        add(size(), e);
        return true;
    }
    
    public void add(int index, E element) {
        throw new MyUnsupportedOperationException();
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
    
}