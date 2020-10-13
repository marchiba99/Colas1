package main.java;

public interface Colas<E> {
    public void push (E e) throws FullE;
    public E pop() throws EmptyE;
    public int tamaño();
}
