public class HeapSort {
    public void sort(int array[]) {
        int length = array.length;


        for (int i = length / 2 - 1; i >= 0; i--) {
            heap(array, length, i);
        }


        for (int i = length - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;


            heap(array, i, 0);
        }
    }
    void heap(int array[], int length, int i) {

        int tepe = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < length && array[l] > array[tepe])
            tepe = l;

        if (r < length && array[r] > array[tepe])
            tepe = r;


        if (tepe != i) {
            int swap = array[i];
            array[i] = array[tepe];
            array[tepe] = swap;

            heap(array, length, tepe);
        }
    }
    void printArray(int array[]) {
        int length = array.length;
        System.out.println("HeapSort ile sıralanan array");
        for (int i = 0; i < length; ++i)
            System.out.print(array[i] + " ");
        System.out.println();
    }
}
