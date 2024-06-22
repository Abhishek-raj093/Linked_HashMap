import java.util.*;

public class DiamondPattern {
    public static void Diamond_Pattern(int n){

        //1st half
        for(int i=1; i<=n; i++){

            //Spaces
            for(int j = 1; j<=(n-i); j++){
                System.out.print(" ");
            }

            //Stars
            for(int j = 1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
         }


        //2st half
        for(int i=n; i>=1; i--){

            //Spaces
            for(int j = 1; j<=(n-i); j++){
                System.out.print(" ");
            }
            
            //Stars
            for(int j = 1; j<=(2*i)-1; j++){
                System.out.print("*");   
        }
        System.out.println();
    }
}
public static void main(Strings args[]){
    Diamond_Pattern(5);
 }
}
