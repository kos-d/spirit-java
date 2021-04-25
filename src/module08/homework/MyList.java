package module08.homework;

public interface MyList<T> {
    
    void add(Object value);     // добавляет элемент в конец
    T remove(int index);        // удаляет элемент под индексом
    void clear();               // очищает коллекцию
    int size();                 // возвращает размер коллекции
    T get(int index);           // возвращает элемент под индексом
}
