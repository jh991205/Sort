import java.util.Arrays;

public class sort {
    public static void swap(int[] a, int x, int y) {
        int temp;
        temp= a[x];
        a[x]= a[y];
        a[y]= temp;
    }

    public static void bubbleSort(int[] a) {
        int n= a.length;
        for (int i= 0; i < n; i++ ) {
            for (int j= 0; j < n - 1; j++ ) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                }
            }
        }
    }

    public static void selectionSort(int[] a) {
        int n= a.length;
        for (int i= 0; i < n - 1; i++ ) {
            int min= i;
            for (int j= i + 1; j < n; j++ ) {
                if (a[j] < a[min]) {
                    min= j;
                }
            }
            if (min != i) { swap(a, i, min); }
        }
    }

    public static void insertionSort(int[] a) {
        int n= a.length;
        for (int i= 1; i < n; i++ ) {
            int j= i;
            while (j > 0 && a[j - 1] > a[j]) {
                swap(a, j, j - 1);
                j= j - 1;
            }
        }
    }

    // https://www.geeksforgeeks.org/quick-sort/ looked for help here
    public static int partition(int a[], int low, int high) {
        int pivot= a[high];
        int index= low - 1;
        for (int j= low; j < high; j++ ) {
            if (a[j] <= pivot) {
                index++ ;
                swap(a, index, j);
            }
        }
        swap(a, high, index + 1);
        return index + 1;
    }

    public static void quickSortHelper(int a[], int low, int high) {
        if (low < high) {
            int pivot= partition(a, low, high);
            quickSortHelper(a, low, pivot - 1);
            quickSortHelper(a, pivot + 1, high);
        }
    }

    public static void quickSort(int a[]) {
        quickSortHelper(a, 0, a.length - 1);
    }

    public static int[] merge(int a[], int b[]) {
        int alen= a.length;
        int blen= b.length;
        int[] c= new int[alen + blen];
        int count= 0;
        int counta= 0;
        int countb= 0;
        while (alen > counta && blen > countb) {
            if (a[counta] < b[countb]) {
                c[count]= a[counta];
                count++ ;
                counta++ ;
            } else {
                c[count]= b[countb];
                count++ ;
                countb++ ;
            }
        }
        while (alen > counta) {
            c[count]= a[counta];
            count++ ;
            counta++ ;
        }
        while (blen > countb) {
            c[count]= b[countb];
            count++ ;
            countb++ ;
        }
        return c;
    }

    public static int[] mergeSortHelper(int[] a) {
        int alen= a.length;
        if (alen == 1) { return a; }
        int[] array1= Arrays.copyOfRange(a, 0, alen / 2);
        int[] array2= Arrays.copyOfRange(a, alen / 2, alen);

        array1= mergeSortHelper(array1);
        array2= mergeSortHelper(array2);

        return merge(array1, array2);
    }

    public static void mergeSort(int[] a) {
        int[] b= mergeSortHelper(a);
        for (int i= 0; i < a.length; i++ ) {
            a[i]= b[i];
        }
    }
}
