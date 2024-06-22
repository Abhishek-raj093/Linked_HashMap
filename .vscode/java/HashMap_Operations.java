import java.util.*;

public class HashMap_Operations {
    public static void main(String args[]) {
        //Create
        HashMap<String, Integer> hm = new HashMap<>();//here hm means hash map

        //Insert-O(1)
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm);

        //Get - O(1)
        // int population = hm.get("India");
        // System.out.println(population);

        // //if we call for Get fun for that data which do not exist in the table then in that case our HashMap will return Null value
        // System.out.println(hm.get("Indonesia"));

        //ContainsKey -O(1)->the containsKey will return true or false depending upon the key exist or not in the table
        //System.out.println(hm.containsKey("India"));//it will return true
        //System.out.println(hm.containsKey("Indonesia"));//it will return false

        //Remove-if we pass a valid key to remove then remove fun will remove both key and its value and return its value and if key not exist then return Null
        // System.out.println(hm.remove("China"));
        // System.out.println(hm);//after deleting the key then we print our map dubara sa

        //Size- to print he size of the hashMap
        System.out.println(hm.size());

        //Is Empty - it is used for checking that our HashMap is empty or Not
        System.out.println(hm.isEmpty());

        //Clear - this fun will clean the HashMap
        hm.clear();
    }
}
