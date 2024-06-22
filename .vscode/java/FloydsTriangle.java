import java.util.*;

public class FloydsTriangle {
    public static void Floads_triangle(int n){
        int Counter = 1;
        //Outer Loop
        for(int i = 1; i <= n; i++){
            //Inner - how many times will Counter be priented
            for(int j=1; j<=i; j++){
                System.out.print(Counter+" ");
                Counter++;
            }
            System.out.println();
        }
    }

    public static void main(Strings args[]){
       Floads_triangle(5); 
    }   
}
