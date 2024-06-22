//Inbuilt Sort
import java.util.Arrays;
import java.util.Collections;

public class InbuiltSort {

    // public static void insertionSort(int arr[]) {
        public static void insertionSort(Integer arr[]) {
        for(int i=1; i<arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            //Finding out the Correct Position to Insert
            while(prev >=0 && arr[prev] > arr[curr]) {//If we will change this condition than it will print it into Descending Order
                arr[prev+1] = arr[prev];
                prev--;
            }
            //Insertion
            arr[prev+1] = curr;
        }
          public static void printArr(Integer arr[]){
            for(int i=0; i<arr.length; i++) {
             System.out.print(arr[i] + " ");
            }
            System.out.println();
    }

    public static void main(String args[]) {
        Integer arr[] = {5, 4, 1, 3, 2};//if we wrie int here then Collection will not work
       // int arr[] = {5, 4, 1, 3, 2};
        // Arrays.sort(arr, 0, 3);
        Arrays.sort(arr, 0, 3, Collections.reverseOrder());
        printArr(arr);
    }
}
//this code is wrom=ng copy the code of bubble sort
