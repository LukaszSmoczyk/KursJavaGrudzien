package WydawanieReszty;

public class WydawanieReszty {

    public static void Reszta(int[] tab, int nominal, int reszta) {

        for (int i = 0; i < tab.length; i++) {
            nominal = tab[i];

            if (reszta > nominal && reszta >= 10) {
                int krotnosc = reszta / nominal;
                reszta = reszta - (krotnosc * nominal);
                System.out.println("Wydano resztę w wysokości: " + (krotnosc * nominal) + " zł, w postaci " + krotnosc + " banknotów o nominale: " + nominal + " zł");
            } else if (reszta > nominal && reszta < 10) {
                int krotnosc1 = reszta / nominal;
                reszta = reszta - (krotnosc1 * nominal);
                System.out.println("Wydano resztę w wysokości: " + (krotnosc1 * nominal) + " zł, w postaci " + krotnosc1 + " monet o nominale: " + nominal + " zł");
            } else if (reszta == nominal) {
                reszta = nominal;
                reszta = 0;
                System.out.println("Wydano resztę w wysokości: " + nominal + " zł, w postaci banknotu/monety " + nominal + " zł");
            } else if (reszta < nominal && reszta < tab[tab.length - 1] && reszta != 0){
                System.out.println("Nie mogę wydać: " + reszta +" zł");
            }
        }
    }

    public static void main(String[] args) {

        int nominal = 0;
        int[] tab = new int[]{500, 200, 100, 50, 20, 10, 5, 2, 1};

        Reszta(tab, nominal, 100);

    }
}
