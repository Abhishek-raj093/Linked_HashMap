import java.util.*;

public class Calculator {
    public static void main(Strings[] args){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int Operation = sc.nextInt();

        switch (Operation) {
            case 1 : System.out.println(a+b);
            break;
            case 2 : System.out.println(a-b);
            break;
            case 3 : System.out.println(a*b);
            break;
            case 4 : if(b == 0) {
                        System.out.println("Invalid Division");
                    } else {
                        System.out.println(a/b);
                    }
         break;
            case 5 : if(b == 0) {
                        System.out.println("Invalid Division");
                    } else {
                        System.out.println(a%b);
                    }
         break; 
            default : System.out.println("Invalid Operator");
        }
    }
 }
 