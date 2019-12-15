package ListaJednokierunkowa;

public class ListaJednokierunkowa {

    private ElementListyJednokierunkowej head;
    private ElementListyJednokierunkowej tail;
    private int index;

    public void add(ElementListyJednokierunkowej element) {
        if (head == null) {
            tail = element;
            head = element;
            index++;
        } else {
            tail.setNext(element);
            tail = element;
            index++;
        }
    }

    public ElementListyJednokierunkowej getHead() {
        return head;
    }

    public void setHead(ElementListyJednokierunkowej head) {
        this.head = head;
    }

    public ElementListyJednokierunkowej getTail() {
        return tail;
    }

    public void setTail(ElementListyJednokierunkowej tail) {
        this.tail = tail;
    }

    public int size(){
        return index;
    }

    public void printList(){
        ElementListyJednokierunkowej temp = this.head;
        while (!(temp==null)){
        System.out.println(temp);
        temp=temp.getNext();}
    }
}


