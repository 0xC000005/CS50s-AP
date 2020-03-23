public class ArrayUtil {
    public static void reverseArray(int[] arr) {
        /* to be implemented in part (a) */
        for (int i = 0; i < (arr.length)/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
            printList(arr);
        }
    }

    public static void printList(int arr[]) {
        for (int item : arr)System.out.print(item + " ");
        System.out.println("");
    }

    // Other methods are not shown.
    public static void main(String[] args) {
        int[] list = { 1, 2, 3, 4};
        reverseArray(list);
        printList(list);
    }
}