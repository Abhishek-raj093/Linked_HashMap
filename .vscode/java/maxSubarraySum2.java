//Max Subarray Sum -III (Kadane's Algorithm)
import java.util.*;

public class maxSubarraySum2 {
    public static void kadanes(int numbers[]) {
        int ms = Integer.MIN_VALUE;//Maximum Sum
        int cs = 0;

        for(int i=0; i<numbers.length; i++) {
            cs = cs + numbers[i];
            if(cs < 0) {
                cs = 0;//Current Sum
            }
            ms = Math.max(cs, ms);//it will Store the maximum value it may cs or ms
        }

        System.out.println("our max subarray sum is : " + ms);
    }

    public static void main(String args[]) {
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};//if the all numbers is -ve in that case our algorithm will give zero in return
        kadanes(numbers);
    }
}
