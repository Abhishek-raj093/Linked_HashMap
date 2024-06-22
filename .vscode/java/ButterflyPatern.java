import java.util.*;

public class ButterflyPatern {
    public static void Butterfly_Pattern(int n){
        //1st half
        //Outer Loop
        for(int i = 1; i <=n; i++){

            //Stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //Spaces - 2*(n-i)
            for(int j = 1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            //Stars - i
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
             System.out.println();
        }
       
        //2nd half
        //outer loop
         for(int i = n; i>=1; i--){

         //Stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //Spaces - 2*(n-i)
            for(int j = 1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            //Stars - i
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
      }

    }
    public static void main(Strings args[]){
        Butterfly_Pattern(4);
    }
    
}
