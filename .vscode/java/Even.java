import java.util.*;

public class Even {
   public static void main (Strings[] args) {
    Scanner sc = new Scanner (System.in); 
    System.out.print("Enter Number");
    // int n = sc.nextInt();
    // if(n%2==0){
    //     System.out.println("even");
    // }else{
    //     System.out.println("odd");
    // }
    int number = sc.nextInt();
    System.out.println("list of Even number from 1 to"+"number");
    for(int i=1; i<=number; i++){
        if(i%2==0){
            System.out.println(i);
        }
    }
   } 
}
