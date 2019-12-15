package ListaJednokierunkowaMojeCwiczenia;

public class Main {


    public static void main(String[] args) {
        ListaJednokierunkowa<ElementListyJednokierunkowej> listaJednokierunkowa = new ListaJednokierunkowa();
        listaJednokierunkowa.add(new ElementListyJednokierunkowej(1));
        listaJednokierunkowa.add(new ElementListyJednokierunkowej(2));
        listaJednokierunkowa.add(new ElementListyJednokierunkowej(54));
        listaJednokierunkowa.add(new ElementListyJednokierunkowej(66));
        listaJednokierunkowa.add(new ElementListyJednokierunkowej(6));



        System.out.println(listaJednokierunkowa.getHead().toString());
        System.out.println(listaJednokierunkowa.getTail().toString());
        System.out.println("---------");
        listaJednokierunkowa.printList();
        System.out.println("Ilość elementów "+listaJednokierunkowa.size());

    }
}
