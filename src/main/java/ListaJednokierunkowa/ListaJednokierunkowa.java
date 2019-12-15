package ListaJednokierunkowa;

public class ListaJednokierunkowa {

    private ElementListyJednokierunkowej head;
    private ElementListyJednokierunkowej tail;
    private int index;
    private final TrybPracyListy trybPracyListy;

    public ListaJednokierunkowa(TrybPracyListy trybPracyListy){
        this.trybPracyListy = trybPracyListy;
    }

    public void add(ElementListyJednokierunkowej element) {
        if (head == null) {
            tail = element;
            head = element;
            index++;
        } else {
            tail.setNext(element);
            element.setPrevious(tail);
            index++;
        }
    }
    public ElementListyJednokierunkowej pop(){
        ElementListyJednokierunkowej result = head;
        if (head != null){
            ElementListyJednokierunkowej next = head.getNext();
            head = next;
            if (next != null){
                next.setPrevious(null);
            } else {
                tail = null;
            }
            index--;
        }
        return result;
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
