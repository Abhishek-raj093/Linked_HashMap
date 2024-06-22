import java.util.*;

public class StringBuilder {
    
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("");
        for(char ch='a'; ch<='z'; ch++) {
        sb.append(ch);//it is used for adding anything back side of our string
        }
            //O(26)
        //System.out.println(sb);
         System.out.println(sb.length());
    }
}
