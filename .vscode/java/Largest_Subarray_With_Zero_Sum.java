import java.util.*;

public class Largest_Subarray_With_Zero_Sum {
    public static void main(String args[]) {//O(n)
        int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};

        HashMap<Integer, Integer> map = new HashMap<>();

        //(sum, idx)

        int sum = 0;
        int len = 0;

        for(int j=0; j<arr.length; j++) {
            sum += arr[j];//yaha pa hum jth index tak ka sum findout karta ha
            if(map.containsKey(sum)) {//ren this loop if the ele already exist in map
                len = Math.max(len, j - map.get(sum));
            } else {
                map.put(sum, j);//if ele not exist in map then put it in this
            }
        }

        System.out.println("Largest subarray with sum as 0 =>" + len);
    }
}
