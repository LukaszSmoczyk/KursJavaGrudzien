package DzielIRzadz;

public class DzieliRzadz {

    public static void Szukaj(int tabela[], int left, int right, int[] wynik){

        left = 0;
        right = tabela.length - 1;

        for (int i = 0; i < tabela.length; i++)
        {
            int minValue = 0;
            int maxValue = 0;

            if (i == 1){
                minValue = tabela[1];
                maxValue = tabela[1];
            }
            else if (i == 2){
                if (tabela[1] > tabela[2])
                    minValue = tabela[1];
                if (tabela[2] > tabela[1])
                    maxValue = tabela[1];
            } else {
                int srodek = (left + right) / 2;
                int[] Wynik1 = new int[2];
                int[] Wynik2 = new int[2];

                Wynik1 = new int[]{left, srodek};
                Wynik2 = new int[]{srodek + 1, right};
            }
            }
        }
    public static void Szukaj2 (int tab1[], int tab2[]){

    }
    public static void main(String[] args) {

        int[] tabela = {10, -5, 5};




        System.out.println();
    }
}
