import java.util.*;

public class Valid_Anagram {
    public static boolean isAnangram(String s, String t) {//ya pa isAnangram ka kaam ha ki find out karna ki doo number anagram ha ya nahi so thats why it will take two strings
        if(s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);//here we findout our char at ith index
            map.put(ch, map.getOrDefault(ch, 0) + 1);//here we check the char at ith index exist or not in map if its not exist then add 1 in defaultvalue i.e. 0 and if it already exist then add 1 in its current frequency
        }

        for(int i=0; i<t.length(); i++) {//here we remove frequency from map
            char ch = t.charAt(i);
            if(map.get(ch) != null) {
                if(map.get (ch) == 1) {
                    map.remove(ch);
                } else {
                    map.put(ch, map.get(ch) - 1);
                }
            } else {
                return false;//iss false ka matlab ha ki t ka under koi assa char ha jo ki 's' ka under exist he nahi kar ta to uss case ma hum false return kar danga
            }
        }
        return map.isEmpty();//here we check that ki map.isEmpty na kya return diya ha true ya false or ya jo bhi return karanga hum bhi who he return kar danga
    }
    public static void main(String args[]) {
        String s = "race";
        String t = "care";

        System.out.println(isAnangram(s, t));
    }
}
//TC of thes code is O(n) where n is the num of char in my string in worst case it is O(n^2)