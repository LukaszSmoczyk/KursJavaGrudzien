package MergeSort;

public class Wspolna {

    // [9 5 3 1 0 12 16]
    public static void scal2(int[] tab, int left, int middle, int right){

        // potrzebuemy okreslic, gdzie w naszej tablicy znajduja sie podtablice do scalenia
        int leftIndex1 = left;
        int rightIndex1 = right;

        int leftIndex2 = middle + 1;
        int rightIndex2 = right;

        int[] tmpTab = new int[tab.length];
        int i = left;

        while (leftIndex1 <= rightIndex2 && leftIndex2 <= rightIndex2){

            if (tab[leftIndex1] < tab[leftIndex2]){
                tab[i] = tab[leftIndex1];
                leftIndex1++;
                } else {
                tmpTab[i] = tab[leftIndex2];
                leftIndex2++;
            }

            i++;
        }

        while (leftIndex1 <= rightIndex1){
        tmpTab[i] = tab[leftIndex1];
        i++;
        leftIndex1++;
        }

        while (leftIndex2 <= rightIndex2){
        tmpTab[i] = tab[leftIndex2];
        i++;
        leftIndex2++;
        }
        for (i = left; i <= right; i++){
            tab[i] = tmpTab[i];
        }
    }


    void sort(int[] tab, int left, int right)
    {
        if (left < right)
        {
            // Find the middle point
            int middle = (left + right)/2;

            // Sort first and second halves
            sort(tab, left, middle);
            sort(tab , middle + 1, right);

            // Merge the sorted halves
            scal2(tab, left, middle, right);
        }
    }

    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver method
    public static void main(String args[])
    {
        int arr[] = {1, 10, 6, 12, 7, 9, 3, 14, 5, 3};

        System.out.println("Dana tablica");
        printArray(arr);

        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length-1);

        System.out.println("\nPosortowana tablica");
        printArray(arr);
    }
}
