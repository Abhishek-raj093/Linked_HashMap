import java.util.*;

public class Linked_HashMap {
    public static void main(String args[]) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("US", 50);

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm);//it will print keys and values without any order
        System.out.println(lhm);//it will print keys and values in order and the order wo ha jis ma hum na insert kiya h
    }
}
