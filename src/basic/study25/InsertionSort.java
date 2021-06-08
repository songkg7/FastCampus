package basic.study25;

public class InsertionSort {

    public static void insertionSort(int[] arr, int count) {

        int temp;

        for (int i = 1; i < count; i++) {
            temp = arr[i];
            int j = i;
            while ((j > 0) && arr[j - 1] > temp) {
                arr[j] = arr[j - 1];
                j -= 1;
            }

            arr[j] = temp;

            System.out.println("반복 - " + i);
            printSort(arr);
        }

    }

    public static void printSort(int[] values) {

        for (int value : values) {
            System.out.print(value + "\t");
        }
        System.out.println();

    }

    public static void main(String[] args) {

        int[] arr = {80, 50, 70, 10, 60, 20, 40, 30};

        insertionSort(arr, 8);

    }

}
