import java.util.Random;

public class QuickSort {
    static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    static void quickSort(int[] array, int lowIndex, int hightIndex) {
        if(lowIndex >= hightIndex) {return;}

        int pivotIndex = new Random().nextInt(hightIndex - lowIndex) + lowIndex;
        int pivot = array[pivotIndex];
        swap(array, pivotIndex, hightIndex);

        int leftPointer = partition(array, lowIndex, hightIndex, pivot);
        quickSort(array, lowIndex, leftPointer - 1);
        quickSort(array, leftPointer + 1, hightIndex);

    }

    private static int partition(int[] array, int lowIndex, int hightIndex, int pivot) {
        int leftPointer = lowIndex;
        int rightPointer = hightIndex;

        while (leftPointer < rightPointer) {
            while(array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }
            while(array[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer --;
            }
            swap(array, leftPointer, rightPointer);
        }
        swap(array, leftPointer, hightIndex);
        return leftPointer;
    }

    static void swap(int[] array, int index1, int index2) {
        int temporary = array[index1];
        array[index1] = array[index2];
        array[index2] = temporary;
    }
}
