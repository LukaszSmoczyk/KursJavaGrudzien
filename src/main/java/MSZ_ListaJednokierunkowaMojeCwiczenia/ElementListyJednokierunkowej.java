package ListaJednokierunkowaMojeCwiczenia;

public class ElementListyJednokierunkowej<T> {
    private int waga;
    private T next;

    public ElementListyJednokierunkowej(int waga) {
        this.waga = waga;
    }


    public int getWaga() {
        return waga;
    }

    public void setWaga(int waga) {
        this.waga = waga;
    }

    public T getNext() {
        return next;
    }

    public void setNext(T next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "ElementListyJednokierunkowej{" +
                "waga=" + waga+"}";

    }
}
