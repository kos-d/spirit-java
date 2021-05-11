package module08.homework.tmp;

public abstract class MyAbstractCollection<E> implements MyCollection<E> {
    
    protected MyAbstractCollection() {        
    }
    
    //public abstract MyIterator<E> iterator();
    
    @Override
    public abstract int size();
    
    @Override
    public boolean add(E e) {
        throw new MyUnsupportedOperationException();
    }
    
    @Override
    public void clear() {
        MyIterator<E> it = iterator();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }
    
    public boolean remove(Object o) {
        MyIterator<E> it = iterator();
        if(o == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    it.remove();
                    return true;
                }
            }
        } else {
            while (it.hasNext()) {
                if (o.equals(it.next())) {
                    it.remove();
                    return true;
                }
             }
        }
        return false;
     }
}