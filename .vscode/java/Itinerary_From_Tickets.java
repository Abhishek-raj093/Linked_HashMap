import java.util.*;

public class Itinerary_From_Tickets {
    public static String getStart(HashMap<String, String> tickets) {//it will return the starting point using HashMap<String, String> tickets this HashMap string type ka
        HashMap<String, String> revMap = new HashMap<>();

        for(String key : tickets.keySet()) {//this is an inhance loop here ek ek key aa ka iss string wala key ma storre ho jaya ga
            revMap.put(tickets.get(key), key);//here we are putting the  yaha key ki gahah value aa jaya gi to hum tickets.get(key) ya likhanga or value ki gaha pa key aa jaya gi to hum direct 'key' likh danga
        }

        for(String key : tickets.keySet()) {
            if(!revMap.containsKey(key)) {
                return key;//Starting point
        }
    }

    return null;
}
    public static void main(String args[]) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);
        System.out.print(start);
        for(String key : tickets.keySet()) {
            System.out.print("->" + tickets.get(start));
            start = tickets.get(start);//yaha pa jo next city aana wala ha ab wo humara starting point banjaya ga
        }

        System.out.println();
    }
}
//TC of this code is O(n)