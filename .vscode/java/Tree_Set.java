import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.*;

public class Tree_Set {
        public static void main(String args[]) {
        HashSet<String> cities = new HashSet<>();//it will print cities without any order
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru"); 
        System.out.println(cities);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();//it will print the cities in order in whic it is inserted
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Bengaluru");
        System.out.println(lhs);

        TreeSet<String> ts = new TreeSet<>();//it will print cities in order that to assending order
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Noida");
        ts.add("Bengaluru"); 
        System.out.println(ts);
//we can apply all the functions which we applied in hashset,linkedhashset we can apply them in tree set as well TC of TreeSet is O(logn) 
    }
}
