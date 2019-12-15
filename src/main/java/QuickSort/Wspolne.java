package QuickSort;

public class Wspolne {

    public static void main(String[] args) {
        int[] tab = {1, 8, 12, 4, 9, 11, 3};


    }
    public static void quickSort (int[] tab, int left, int right){

        if (left == right){
            return;
        }

        int pivotIndex = left;
        int switchIndex = right;
        boolean fromLeft = false;

        while (switchIndex != pivotIndex) {
            if ((tab[pivotIndex] > tab[switchIndex] && fromLeft) || tab[pivotIndex] < tab[switchIndex] && !fromLeft) {

                int tempValue = tab[switchIndex];
                tab[switchIndex] = tab[pivotIndex];
                tab[pivotIndex] = tempValue;

                int tempIndex = switchIndex;
                switchIndex = pivotIndex;
                pivotIndex = tempIndex;

                fromLeft = !fromLeft;
            }
            if (fromLeft) {
                switchIndex++;
            } else {
                switchIndex--;
            }
        }
        quickSort(tab, left, pivotIndex -1);
        quickSort(tab, pivotIndex + 1, right);
    }
}
