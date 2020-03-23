public class insertionSort {
    private static void swap(int[] list, int indexA, int indexB) {
        int temp = list[indexA];
        list[indexA] = list[indexB];
        list[indexB] = temp;
    }

    private static void printList(int[] list) {
        for (int item : list)
            System.out.print(item + " ");
        System.out.println("");
    }

    private static void insertNum(int[] list, int index) {
        while (index > 0 && list[index - 1] > list[index]) {
            swap(list, index, index - 1);
            index--;
        }
    }

    public static void main(String[] args) {
        int[] list = { 8, 1, 4, 6 };
        printList(list);
        for (int i = 1; i < list.length; i++) {
            insertNum(list, i);
            printList(list);
        }
    }
}