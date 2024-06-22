import java.util.*;

public class SolidRhombus {
    public static void Solid_Rhombus(int n){
        
        //Outer Loop
        for(int i = 1; i <= n; i++){

            //Spaces
            for(int j = 1; j <=(n-i); j++){
                System.out.print(" ");
            }

            //Stars
            for(int j = 1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(Strings args[]){
        Solid_Rhombus(5);
    }
}
