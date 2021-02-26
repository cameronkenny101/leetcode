import java.util.Random;

public class SortingAlgorithms {

    public static void main(String[] args) {
        System.out.println("hello");
        int[] arr = arrayOfSizeN(100);
        Stopwatch time = new Stopwatch();
        markSort(arr);
        StdOut.println("elapsed time = " + time.elapsedTime());
        printArray(arr);
    }

    public static int[] arrayOfSizeN(int N) {
        // Generates a random array of size N
        int[] array = new int[N];
        Random random = new Random();
        for(int i = 0; i < N; i++) {
            array[i] = random.nextInt(Integer.MAX_VALUE);
        }
        return array;
    }

    public static void printArray(int[] arr) {
        // Prints array
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void selectionSort(int arr[]) {
        // This sorting algorithm looks ahead before sorting
        for(int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[minIndex])
                    minIndex = j;
                swap(arr, i, minIndex);
            }
        }
    }

    public static void insertionSort(int arr[]) {
        // This sorting algorithm looks behind before sorting
        for(int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                --j;
            }
            arr[j + 1] = key;
        }
    }

    public static void markSort(int arr[]) {
        // Sorts algorithm in linear time. Named after lecturer. Gave me the wisdom to create such an elegant sorting algorithm
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1])
                arr[i + 1] = arr[i];
            else {
                continue;
            }
        }
    }

    // Swap function
    private static void swap(int arr[], int i, int min) {
        int temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;
    }
}
