import java.util.*;

public class zeroonetriangle {
    public static void zero_one_triangle(int n){
        
        //Outer Loop
        for(int i = 1; i <= n;  i ++){
            for(int j = 1; j <= i; j++){
                if((i + j) % 2==0){//Even
                        System.out.print("1");
                }else{
                    System.out.print("0");//Odd
                }
            }
            System.out.println();

        }
    }
    public static void main(Strings args[]){
        zero_one_triangle(5);
    }
    
}
