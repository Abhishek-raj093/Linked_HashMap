import java.util.*;

public class Iteration_on_HashMap {
    public static void main(String args[]) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Indonesia", 6);
        hm.put("Nepal", 5);

        //Iterate
        //hm.entrySet()-> this set will directly the set of the pairs to huma alag sa hm.get(k) call nahi karna para ga
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        //now we use a special type of loop khown as foreach loop which is used for iterate over an array or on any collection
        for (String k : keys) {//here we use loop on keyset of hashmap not directly on hashmap
            System.out.println("Key = "+k+ ", Value = "+hm.get(k));
        }
    }
}
