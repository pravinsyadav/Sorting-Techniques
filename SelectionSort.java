public class SelectionSort {

    // Function to perform Selection Sort
    public static void selectionSort(int[] array) {
        int n = array.length;

        // Move through the array one element at a time
        for (int i = 0; i < n - 1; i++) {
            // Assume the minimum element is the current element
            int minIndex = i;

            // Check the rest of the array to find the actual minimum element
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j; // Update the index of the minimum element
                }
            }

            // Swap the minimum element found with the current element
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    // Main method to test the sorting algorithm
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        System.out.println("Unsorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        selectionSort(arr); // Sorting the array using selection sort

        System.out.println("\nSorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
