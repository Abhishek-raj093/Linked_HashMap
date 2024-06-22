import java.util.*;

public class invertedhaifPyramid {
    public static void inverted_half_pryamid(int n){
        //Outer Loop
        for(int i = 1; i <= n; i++){
            //Inner Loop
            for(int j = 1; j <= n-i+1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(Strings args[]){
        inverted_half_pryamid(5);
    }
    
}
