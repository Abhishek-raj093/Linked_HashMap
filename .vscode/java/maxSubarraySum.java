//Max sub array sum -1(Brute Force)

import java.util.*;


public class maxSubarraySum {
    public static void maxSubarraySum(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
    
        for(int i =1; i<numbers.length; i++){
           int start = i;
           for(int j=i; j<numbers.length; j++){
            int end =j;
            currSum=0;
            for(int k=start; k<=end; k++){ //print
                //Subarray Sum
                currSum += numbers[k];  
            }    
              System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max Sum = " + maxSum);
    }
    public static void main(Strings args[]){
        int numbers[] = {1, -2, 6, -1, 3};
        maxSubarraySum(numbers);
    }
}

