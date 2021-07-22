package Lesson4;

public interface MyList<E> {

    public void add(E element);
    public void remove(int index);
    public E get(int index);
    public int size();
    public String toString();

}
