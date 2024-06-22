import java.util.*;

public class Linked_HashSet {

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
        //we can perfrom all the operatons on inkedHashSet which we performon HashSet like bellow and we can alpply iterator, for loop and the code for this will be same which we implement in HashSet
        lhs.remove("Delhi");
        System.out.println(lhs);
    }
}