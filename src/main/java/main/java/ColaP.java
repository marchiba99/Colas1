package main.java;

public class ColaP<E> implements Colas<E>{
    E[] data;
    public ColaP(int len){
        int limite=0;
        for(limite, limite<len ,limite++)
        {
            this.data [limite] =;
        }
                //definir cola n posiciones
    }
   public void push(E e) throws FullE {
    if (this.llena()) throw new  FullE();
    this.data(this.p++) = e;
    }

    private boolean llena() {
        return true;
    }

    public E pop() throws EmptyE {
        if (this.Vacia()) throw new  EmptyE();
       E e = this.data[0];
       IzqSfift();
       return e;
    }

    private void IzqSfift() {
    }

    private boolean Vacia() {
        return true;
    }drf

    public int tamaño() {
        return 0;
    }
}
