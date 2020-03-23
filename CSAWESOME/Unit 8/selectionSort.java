public class selectionSort {

    private static void swap(int[] list, int index1, int index2) {
        int temp = list[index1];
        list[index1] = list[index2];
        list[index2] = temp;
    }

    private static void printList(int[] list) {
        for (int item : list) {
            System.out.print(item + " ");
        }
        System.out.println("");
    }

    private static int findSmallest(int[] list, int start, int end) {
        int min = list[start];
        int index = 0;
        for (int i = start + 1; i <= end; i++) {
            if (list[i] < min)
            {
                min = list[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] list = { 8, 1, 4, 6 };
        printList(list);

        //对于n的数列只需要对比n-1次
        for (int i = 0; i < list.length-1; i++) {
            int minIndex = findSmallest(list,i,list.length-1);
            swap(list,i,minIndex);
            printList(list);
        }
    }
}