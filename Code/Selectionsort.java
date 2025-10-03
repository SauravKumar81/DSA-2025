import java.util.*;   // Scanner, Arrays

class Selectionsort {
    static void SelectionSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            // swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        // take all elements in one line
        System.out.println("Enter " + n + " elements separated by space:");
        String[] input = sc.nextLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        // sort
        SelectionSort(arr, n);

        // print result
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
