import java.util.*;

public class HollowRhombus {
    public static void hollow_Rhombus(int n){
        for(int i = 1; i<=n; i++){
            //printing spaces
             //Spaces
             for(int j = 1; j <=(n-i); j++){
                System.out.print(" ");
            }
             //Inner - Columns
             for(int j = 1; j <= n; j++){
                //Cell - (i,j)
                if(i == 1 || i ==  n || j == 1 || j == n){
                    //Boundary Cells
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
    }
}
public static void main(Strings args[]){
    hollow_Rhombus(5);
    }
  }

