import java.util.*;

public class palindrom {
    public static boolean isPalindrome(String str) {
        for(int i=0; i<str.length()/2; i++) {
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)) {
              //Not a Palindrome
              return false;  
            }
        }

        return true;
    }

    public static void main(String args[]) {
        String str = "racecar";
        String str2 = "noon";
        String str3 = "Abhishek";
        System.out.println(isPalindrome(str));
        System.out.println(isPalindrome(str2));
        System.out.println(isPalindrome(str3));
    }
}
