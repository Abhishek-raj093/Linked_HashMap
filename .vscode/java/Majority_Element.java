import java.util.*;

public class Majority_Element {
    // public static void main(String args[]) {
    //     int arr[] = {1, 3, 2, 5, 1, 3, 1, 5, 1};
    //     HashMap<Integer, Integer> map = new HashMap<>();//here we use <Integer, Integer> becaue our key and value both are the integer type

    //     for(int i=0; i<arr.length; i++) {
    //         if(map.containsKey(arr[i])) {
    //             map.put(arr[i], map.get(arr[i]) + 1);
    //         } else {
    //             map.put(arr[i], 1);
    //         }
    //     }

    //     Set<Integer> keySet = map.keySet();
    //     for (Integer key : keySet) {//we use this type of for loop when we have to triverse the collection of objects
    //         if(map.get(key) > arr.length/3) {
    //             System.out.println(key);
    //         }

    //     }
    // }

    //Now we try to make the above code small

    public static void main(String args[]) {
        int arr[] = {1, 3, 2, 5, 1, 3, 1, 5, 1};
        HashMap<Integer, Integer> map = new HashMap<>();

    for(int i=0; i<arr.length; i++) {
    map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);//here map.getOrDefault it is same as the map.get function means we pass a key and if that key exist then we will get the value associated with it  and if value do't exist in map then this fun will return default value and this default value we can pass it as a parameter
   
}

        for (Integer key : map.keySet()) {//now here we do't need to store this map.keySet() data structure any where else. here we use keyset inside the loop
            if(map.get(key) > arr.length/3) {
                System.out.println(key);
            }
        }
    }
}

//TC of this code is O(n)
