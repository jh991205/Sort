import java.util.Arrays;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SortingAlgorithmsTest {

    @Test
    void testBubbleSort() {
        int[] a= new int[] { 1, 3, 5, 4, 2 };
        int[] b= new int[] { 1, 3, 5, 4, 2 };
        Arrays.sort(b);
        sort.bubbleSort(a);
        Assert.assertArrayEquals(a, b);

        a= new int[] { 1, 2, 5, 4, 2 };
        b= new int[] { 1, 2, 5, 4, 2 };
        Arrays.sort(b);
        sort.bubbleSort(a);
        Assert.assertArrayEquals(a, b);
    }

    @Test
    void testSelectionSort() {
        int[] a= new int[] { 1, 3, 5, 4, 2 };
        int[] b= new int[] { 1, 3, 5, 4, 2 };
        Arrays.sort(b);
        sort.selectionSort(a);
        Assert.assertArrayEquals(a, b);

        a= new int[] { 1, 2, 5, 4, 2 };
        b= new int[] { 1, 2, 5, 4, 2 };
        Arrays.sort(b);
        sort.selectionSort(a);
        Assert.assertArrayEquals(a, b);
    }

    @Test
    void testInsertionSort() {
        int[] a= new int[] { 1, 3, 5, 4, 2 };
        int[] b= new int[] { 1, 3, 5, 4, 2 };
        Arrays.sort(b);
        sort.insertionSort(a);
        Assert.assertArrayEquals(a, b);

        a= new int[] { 1, 2, 5, 4, 2 };
        b= new int[] { 1, 2, 5, 4, 2 };
        Arrays.sort(b);
        sort.insertionSort(a);
        Assert.assertArrayEquals(a, b);
    }

    @Test
    void testquickSort() {
        int[] a= new int[] { 1, 3, 5, 4, 2 };
        int[] b= new int[] { 1, 3, 5, 4, 2 };
        Arrays.sort(b);
        sort.quickSort(a);
        Assert.assertArrayEquals(a, b);

        a= new int[] { 1, 2, 5, 4, 2 };
        b= new int[] { 1, 2, 5, 4, 2 };
        Arrays.sort(b);
        sort.quickSort(a);
        Assert.assertArrayEquals(a, b);
    }

    @Test
    void testMergeSort() {
        int[] a= new int[] { 1, 3, 5, 4, 2 };
        int[] b= new int[] { 1, 3, 5, 4, 2 };
        Arrays.sort(b);
        sort.mergeSort(a);
        Assert.assertArrayEquals(a, b);

        a= new int[] { 1, 2, 5, 4, 2 };
        b= new int[] { 1, 2, 5, 4, 2 };
        Arrays.sort(b);
        sort.mergeSort(a);
        Assert.assertArrayEquals(a, b);
    }
}
