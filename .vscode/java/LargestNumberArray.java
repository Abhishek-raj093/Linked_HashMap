import java.util.*;

public class LargestNumberArray {
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;//-infinity
        int smallest = Integer.MAX_VALUE;//+ infinity

        for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];//it will update the value of largest

            }
            if(smallest > numbers[i]){
                smallest = numbers[i]; // it updates the value of smallest when we find a smaller number
            }

        }
        System.out.println("smallest value is : " + smallest);
        return largest;
    }
    public static void main(String args[]){
        int numbers[] = {1,2,6,5};
        System.out.println("Largest Value is : " + getLargest(numbers));
    }
}
