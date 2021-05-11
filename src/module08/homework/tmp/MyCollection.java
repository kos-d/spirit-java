package module08.homework.tmp;

public interface MyCollection<E> extends MyIterable<E>{
    
    //boolean add(Object value);
    boolean add(E e);
    
    E remove(int index); 
    
    void clear(); 
    
    int size();
    
    E get(int index);
    
}