//Selection Sort
import java.util.*;//O(n2)

public class SelectionSort {
    public static void selection_Sort(int arr[]) {
        for(int i=0; i<arr.length-1; i++) {
            int minPos = i;//minimum position
            for(int j=i+1; j<arr.length; j++) {
                if(arr[minPos] > arr[j]) {//it is for increasing order
                    minPos = j;
                }
            }
            //Swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
            public static void printArr(int arr[]){
            for(int i=0; i<arr.length; i++) {
             System.out.print(arr[i] + " ");
            }
            System.out.println();
    }
    public static void main(Strings args[]) {
        int arr[] = {5, 4, 1, 3, 2};
        selection_Sort(arr);
        printArr(arr);
    }
}
