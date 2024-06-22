import java.util.*;

public class Iteration_Using_Iterators_on_HashSet {
    public static void main(String args[]) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");

        //this is the 1st way in which we are using iterator
        // Iterator it = cities.iterator();//here each set have there own iterator method which will return a valied iterator to it cities.iterator() here cities is a set and here "it" will store the next value of the set 
        // while(it.hasNext()) {
        //     System.out.println(it.next());//it will print set without any order
        // }

        //this is the 2nd why inwhich we are using advance loop for iteration
        for(String city:cities){//yaha cities sa ek ek kar ka sari city iss String city ma store hoja yangi
            System.out.println(city);//we caan do many operations here like we can find out the longest city name, we can arrange the city alphabitacily,we can find out the max or min...etc.
    }
 }
}
