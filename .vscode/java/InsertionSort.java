//Insertion sort -O(n2)
import java.util.*;

public class InsertionSort {
    public static void insertionSort(int arr[]) {
        for(int i=1; i<arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            //Finding out the Correct Position to Insert
            while(prev >=0 && arr[prev] > curr) {//If we will change this condition than it will print it into Descending Order
                arr[prev+1] = arr[prev];
                prev--;
            }
            //Insertion
            arr[prev+1] = curr;
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
        insertionSort(arr);
        printArr(arr);
    }
}
