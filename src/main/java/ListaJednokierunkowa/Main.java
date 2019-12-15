package ListaJednokierunkowa;

public class Main {
    public static void main(String[] args) {
        ListaJednokierunkowa listaJednokierunkowa = new ListaJednokierunkowa();
        listaJednokierunkowa.add(new ElementListyJednokierunkowej(12));
        listaJednokierunkowa.add(new ElementListyJednokierunkowej(15));
        listaJednokierunkowa.add(new ElementListyJednokierunkowej(18));
        listaJednokierunkowa.add(new ElementListyJednokierunkowej(58));
        listaJednokierunkowa.add(new ElementListyJednokierunkowej(78));
        listaJednokierunkowa.pop();



        System.out.println(listaJednokierunkowa.getHead().toString());
        System.out.println(listaJednokierunkowa.getTail().toString());
        System.out.println("---------");
        listaJednokierunkowa.printList();
        System.out.println("Ilość elementów "+listaJednokierunkowa.size());


    }
}
