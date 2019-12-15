package ListaJednokierunkowa;

public class ElementListyJednokierunkowej {
    private int waga;
    private ElementListyJednokierunkowej next;
    private ElementListyJednokierunkowej previous;

    public ElementListyJednokierunkowej(int waga) {
        this.waga = waga;
    }


    public Integer getWaga() {
        return waga;
    }

    public void setWaga(Integer waga) {
        this.waga = waga;
    }

    public ElementListyJednokierunkowej getNext() {
        return next;
    }

    public void setNext(ElementListyJednokierunkowej next) {
        this.next = next;
    }

    public ElementListyJednokierunkowej getPrevious() {
        return previous;
    }

    public void setPrevious(ElementListyJednokierunkowej previous) {
        this.previous = previous;
    }

    @Override
    public String toString() {
        return "ElementListyJednokierunkowej{" +
                "waga=" + waga+"}";

    }
}
