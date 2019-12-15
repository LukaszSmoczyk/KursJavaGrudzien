package MergeSort;

public class Merge {
    public static void merge(int[] tab, int left, int middle, int right) {

        int n1 = middle - left + 1;
        int n2 = right - middle;

        int L[] = new int [n1];
        int R[] = new int [n2];

        for (int i = 0; i < n1; ++i){
            L[i] = tab[left +1];
        }
        for (int j = 0; j < n2; ++j){
            R[j] = tab[middle + 1 + j];
        }

        int i = 0;
        int j = 0;

        int k = left;
        while (i < n1 && j < n2)
        {

        }
    }


}
