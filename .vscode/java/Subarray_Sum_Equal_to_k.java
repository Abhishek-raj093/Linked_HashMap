import java.util.*;

public class Subarray_Sum_Equal_to_k {
    public static void main(String args[]) {//O(n)
        int arr[] = {10, 2, -2, -20, 10};
        int k = -10;

        HashMap<Integer, Integer> map = new HashMap<>();
        //(sum, count)
        map.put(0, 1);

        int sum =0;
        int ans = 0;

        for(int j=0; j<arr.length; j++) {
            sum += arr[j];//sum(j)
            if(map.containsKey(sum - k)) {// if sum(j)-k exist then add its count in ans by map.get
                ans += map.get(sum - k);
        }
        map.put(sum, map.getOrDefault(sum, 0) + 1);//here we use the fun get and default
    }
    System.out.println(ans);
   }
}
//TC = O(n) hashmap ka karan huma space jayada dani pari par TC kam ha