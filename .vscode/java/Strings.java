import java.util.*;

public class Strings {
public static void printLatters(String str) { //We can print the Locattion of all letters of String Using this
    for(int i=0; i<str.length(); i++) {
        System.out.print(str.charAt(i) + " ");
    }
    System.out.println();
}
    public static void main(String args[]) {
        // char arr[] = {'a', 'b', 'c', 'd'};
        // String str = "abcd";
        // String str2 = new String("xyz@#1234");

        // //Strings are IMMUTABLE(it can never change)

        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.println(name);

        //Concatenation
        String firstName = "Abhishek";
        String lastName = "Singh";
        String fullName = firstName + " " + lastName;
        //System.out.println(fullName.length());
       // System.out.println(fullName.charAt(1));
       
       printLatters(fullName);
    }
}
