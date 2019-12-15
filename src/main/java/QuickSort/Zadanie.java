package QuickSort;

public class Zadanie {

    int Sort(int tab[], int left, int right){

        tab = new int[]{5, 8, 1, 3, 7, 9, 2};

        int pivot = tab[right];
        int i = (left - 1);

        for (int j = left; j < right; j++){
            if (tab[j] < pivot){
            int tymczasowy = tab[i];
            tab[i] = tab[j];
            tab[j] = tymczasowy;
            }
        }
            int tymczasowy = tab[i + 1];
            tab[i + 1] = tab[right];
            tab[right] = tymczasowy;

            return i + 1;
        }
}
