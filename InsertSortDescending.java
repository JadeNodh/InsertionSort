public class DescendingInsertionSort {

    public static void insertionSortDescending(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements that are smaller than key to one position ahead
            // of their current position
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Place the key at its correct position
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] array = {42, 20, 17, 13, 28, 14, 23, 15};
        System.out.println("Original array:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        insertionSortDescending(array);

        System.out.println("\nSorted array in descending order:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
