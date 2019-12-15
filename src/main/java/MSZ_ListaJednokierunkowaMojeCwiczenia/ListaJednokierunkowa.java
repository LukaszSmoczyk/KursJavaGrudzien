package ListaJednokierunkowaMojeCwiczenia;

public class ListaJednokierunkowa<T extends ElementListyJednokierunkowej> {

    private T head;
    private T tail;
    private int index;

    public void add(T element) {
        if (head == null) { tail = element;
            head = element;
            index++;
        } else {
            tail.setNext(element);
            tail = element;
            index++;
        }
    }

    public T getHead() {
        return (T) head;
    }

    public void setHead(T head) {
        this.head = head;
    }

    public T getTail() {
        return tail;
    }

    public void setTail(T tail) {
        this.tail = tail;
    }

    public int size(){
        return index;
    }

    public void printList(){
        T temp = this.head;
        while (!(temp==null)){
        System.out.println(temp);
        temp= (T) temp.getNext();}
    }
}


